package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Console;
import java.math.BigInteger;
import java.util.Properties;
import java.util.Scanner;

@SpringBootApplication
public class PropertiesspringbootApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(PropertiesspringbootApplication.class);
		Properties properties = new Properties();
		//Inserting a sample oracle driver
		properties.put("spring.datasource.url","jdbc:oracle:thin:@localhost:1521/orcl");
		properties.put("spring.datasource.username","username");
		System.out.println("Enter the password for your database");
		//Console to read password
		Console console = System.console();
		char[] password = console.readPassword();
		//Will throw a null pointer exception if tried to execute program in IDE.
		properties.put("spring.datasource.password",password);
		//Scanner to take values
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the port you want to run the application");
		BigInteger port = sc.nextBigInteger();

		//SpringApplication.run(PropertiesspringbootApplication.class, args);
	}
}
