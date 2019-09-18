package com.example.myapplication.Activities.InfoActivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.myapplication.R;
import com.google.firebase.firestore.FirebaseFirestore;

public class TypePractice1 extends AppCompatActivity {
    private Button next1,run1;
    private Integer start = 0;
    private FirebaseFirestore mFirestore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_practice1);
        next1 = findViewById(R.id.typeNext1);
        mFirestore = FirebaseFirestore.getInstance();


    }
}
