package com.training.springboot.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Examples{
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
		private String name;

		private Date ExampleDate;

		private BigDecimal ExamplePrice;

		public String getName() {
			return name;
		}

		public Date getExampleDate() {
			return ExampleDate;
		}

		public BigDecimal getExamplePrice() {
			return ExamplePrice;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setExampleDate(Date exampleDate) {
			ExampleDate = exampleDate;
		}

		public void setExamplePrice(BigDecimal examplePrice) {
			ExamplePrice = examplePrice;
		}
		

}
