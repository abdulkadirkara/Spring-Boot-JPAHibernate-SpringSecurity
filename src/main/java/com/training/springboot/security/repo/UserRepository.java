package com.training.springboot.security.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.springboot.security.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	  Optional<User> findByUsername(String username);
	}