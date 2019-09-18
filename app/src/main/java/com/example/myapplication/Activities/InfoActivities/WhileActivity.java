package com.example.myapplication.Activities.InfoActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class WhileActivity extends AppCompatActivity {
    private Button feeding,practice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_while);
        feeding=findViewById(R.id.bugBtn2);
        practice=findViewById(R.id.loopBtnPra);
        feeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Feedback.class);
                startActivity(a);
            }
        });
        practice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),LoopPractice1.class);
                startActivity(a);
            }
        });
    }
}
