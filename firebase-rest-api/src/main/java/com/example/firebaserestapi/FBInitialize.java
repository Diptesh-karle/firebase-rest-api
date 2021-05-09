package com.example.firebaserestapi;

import java.io.FileInputStream;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Service
public class FBInitialize {

	@PostConstruct
	public static void initialize() {
		try {
	        FileInputStream serviceAccount =
	                  new FileInputStream("C:\\Users\\Diptesh.Karle\\Documents\\firebase-rest-api\\serviceAccount.json");

	                FirebaseOptions options = new FirebaseOptions.Builder()
	                  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
	                  .setDatabaseUrl("https://fir-rest-api-75405-default-rtdb.firebaseio.com")
	                  .build();
                    if(FirebaseApp.getApps().isEmpty()) {
	                FirebaseApp.initializeApp(options);
                    }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	
	} // end of initialize()
	
} // end of class
