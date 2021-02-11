package com.example.MyFirstSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringAppApplication {

	public static void main(String[] args) {
		/*
		* This is the main class where Spring will execute the
		* SpringApplication class with the run method to run the application
		* */
		SpringApplication.run(MyFirstSpringAppApplication.class, args);
	}


}
