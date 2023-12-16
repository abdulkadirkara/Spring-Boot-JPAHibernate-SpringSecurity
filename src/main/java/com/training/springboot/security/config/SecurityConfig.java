package com.training.springboot.security.config;

import com.training.springboot.security.filter.JwtTokenFilter;
import com.training.springboot.security.utils.JwtTokenProvider;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.beans.factory.annotation.Autowired;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

	  @Autowired
	    private JwtTokenProvider jwtTokenProvider;
	  
  private final JwtTokenFilter jwtAuthenticationFilter;
  private final UserDetailsService userDetailsService;
private DaoAuthenticationProvider daoAuthenticationProvider;

  public SecurityConfig(JwtTokenFilter jwtAuthenticationFilter,
          UserDetailsService userDetailsService) {
this.jwtAuthenticationFilter = jwtAuthenticationFilter;
this.userDetailsService = userDetailsService;
this.daoAuthenticationProvider = new DaoAuthenticationProvider();
}
  
  @Bean
  public AuthenticationProvider authenticationProvider() {
      DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
      authProvider.setUserDetailsService(userDetailsService);
      authProvider.setPasswordEncoder(passwordEncoder());
      return authProvider;
  }

  @Bean
  PasswordEncoder passwordEncoder() {
	  return new BCryptPasswordEncoder();
  }
  
  @Bean
  public JwtTokenProvider jwtTokenProvider() {
      return new JwtTokenProvider();
  }
  

  @Bean
  AuthenticationManager authenticationManager(
      AuthenticationConfiguration authenticationConfiguration) throws Exception {
    return authenticationConfiguration.getAuthenticationManager();
  }

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

      httpSecurity.headers(headers -> headers.frameOptions().disable());

      httpSecurity.cors(withDefaults()).csrf(csrf -> csrf.disable());
      //@formatter:off
      httpSecurity
              .authorizeHttpRequests(requests -> requests
                      .requestMatchers("/api/auth/**").permitAll()
                      .anyRequest().authenticated())
              .sessionManagement(management -> management
                      .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
              .exceptionHandling(handling -> handling
                      .authenticationEntryPoint(
                              (request, response, authException)
                                      -> response.sendError(
                                              HttpServletResponse.SC_UNAUTHORIZED,
                                              authException.getLocalizedMessage()
                                      )
                      ))
              .authenticationProvider(authenticationProvider())
              .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
      
    //@formatter:on
    return httpSecurity.build();
  }
  
  @Bean
  public WebSecurityCustomizer webSecurityCustomizer() {
      return (web) -> web.ignoring().requestMatchers(new AntPathRequestMatcher("/h2-console/**"));
  }
}
