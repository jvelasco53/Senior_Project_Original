package com.example.myapplication.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.Activities.InfoActivities.Feedback;
import com.example.myapplication.Activities.InfoActivities.WhileActivity;
import com.example.myapplication.Activities.InfoActivities.LoopingActivity1;
import com.example.myapplication.R;

public class LoopActivity extends AppCompatActivity {
    Button whileL,forL,feeding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop);

        whileL = findViewById(R.id.whileBtn);
        forL = findViewById(R.id.forBtn);
        feeding=findViewById(R.id.bugBtn3);

        feeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Feedback.class);
                startActivity(a);
            }
        });

        whileL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent whileL1 = new Intent(getApplicationContext(), WhileActivity.class);
                startActivity(whileL1);
            }
        });
        forL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forL1 = new Intent(getApplicationContext(), LoopingActivity1.class);
                startActivity(forL1);
            }
        });
    }
}
