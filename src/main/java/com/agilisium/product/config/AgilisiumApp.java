package com.agilisium.product.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * This is class responsible to start the application with Spring Boot
 * 
 * @author DhanabalM
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.agilisium.product" })
public class AgilisiumApp {

	/**
	 * Method to run spring boot application
	 * 
	 * @param args
	 *            which contains default arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(AgilisiumApp.class, args);
	}
}
