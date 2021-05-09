package com.example.firebaserestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirebaseRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirebaseRestApiApplication.class, args);
		FBInitialize.initialize();
	}

} // end of class
