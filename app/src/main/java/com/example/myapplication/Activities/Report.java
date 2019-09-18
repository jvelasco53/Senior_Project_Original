package com.example.myapplication.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication.R;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Report extends AppCompatActivity {
    private static final String Tag = "Report";

    private static final String Message = "message";
    private static final String name="";
    private EditText box;

    private FirebaseFirestore fb = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        box.findViewById(R.id.enter123);

    }

    public void sendIt(View view) {
        String n = box.getText().toString();

        Map<String, Object> note = new HashMap<>();
        note.put(Message, n);

        fb.collection("Notebook").document("Report");
    }
}
