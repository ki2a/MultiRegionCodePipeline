package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HelloApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(HelloApplication.class, args);
	}

}
