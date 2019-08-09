package com.demo;

import javax.xml.ws.RequestWrapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SecondSpringBootApplication {

	@RequestMapping("/sayMessage")
	public String getMessage() {
		return "CONGO";
	}
	@RequestMapping("/sayHI")
	public String getMessage1() {
		return "HI";
	}
	@RequestMapping("/sayBYE")
	public String getMessage2() {
		return "BYE";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SecondSpringBootApplication.class, args);
	}

}
