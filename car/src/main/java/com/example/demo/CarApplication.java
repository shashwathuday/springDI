package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CarApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CarApplication.class, args);
		
		tesla obj1 = context.getBean(tesla.class);
		
		obj1.show();
		
		tesla obj2 = context.getBean(tesla.class);
		
		obj2.show();
	}

}
