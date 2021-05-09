package com.example.firebaserestapi.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.example.firebaserestapi.datamodel.Consumer;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;


@Service
public class ConsumerService {

	public String saveConsumerDetails(Consumer consumer) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection("users").document(consumer.getName()).set(consumer);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }
} // end of class
