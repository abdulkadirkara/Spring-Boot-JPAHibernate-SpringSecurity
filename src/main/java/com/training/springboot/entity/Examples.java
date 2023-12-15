package com.training.springboot.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import org.springframework.data.mongodb.core.mapping.Document;


@Entity
@Document(collection = "Examples")
public class Examples {
	
		
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
