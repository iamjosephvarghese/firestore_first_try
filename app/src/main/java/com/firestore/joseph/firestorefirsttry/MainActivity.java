package com.firestore.joseph.firestorefirsttry;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FirebaseFirestore db = FirebaseFirestore.getInstance();

        Map<String,Object> student = new HashMap<>();
        student.put("firstName","J");
        student.put("lastName","V");
        student.put("age",20);

//      TODO: Adding data fields to document inside the collection students
        db.collection("students").add(student).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Log.d("Document Reference Id",documentReference.getId());
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("Error",e.toString());
            }
        });





//      TODO: Creating a map called towns
        Map<String,String> towns = new HashMap<>();
        towns.put("1","a");
        towns.put("2","b");
        towns.put("3","c");

//      TODO: Creating a map called city to be pushed to firestore database with one field being the map called towns called towns created above
        Map<String,Object> city = new HashMap<>();
        city.put("name","thrissur");
        city.put("townList",towns);

//      TODO: Pushing fields to a document inside collection data which is inside a document named 1 which is further inside the collection cities
        db.collection("cities").document("1").collection("data").add(city).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Log.d("Upload","success");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });


//        TODO: Pushing with document id rather than using the id generated by the add function
        db.collection("students").document("newStudent").set(student).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Log.d("Upload","Success");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("Upload","Error");
            }
        });

//        TODO: Using merge so that exsisting data will not be over written
        Map<String, Object> data = new HashMap<>();
        data.put("ph","007");

        data.put("capital", true);db.collection("students").document("newStudent").set(data, SetOptions.merge()).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Log.d("Merge","Success");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("Merge","Error");
            }
        });

//        TODO: Different data types supported in firestore

        Map<String, Object> docData = new HashMap<>();
        docData.put("stringExample", "Hello world!");
        docData.put("booleanExample", true);
        docData.put("numberExample", 3.14159265);
        docData.put("dateExample", new Date());
        docData.put("listExample", Arrays.asList(1, 2, 3));
        docData.put("nullExample", null);

        Map<String, Object> nestedData = new HashMap<>();
        nestedData.put("a", 5);
        nestedData.put("b", true);

        docData.put("objectExample", nestedData);


        db.collection("students").document("types").set(docData,SetOptions.merge()).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Log.d("Upload","Success");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("Upload","Error");

            }
        });



    }
}
