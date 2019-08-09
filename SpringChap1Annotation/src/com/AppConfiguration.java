package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfiguration {
	@Bean

	public Customer getCustomerObject() {
		return new Customer();
	}
	
	@Bean
	public Address getAddresObject() {
		return new Address();
	}
}
