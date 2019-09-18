package com.example.myapplication.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.Activities.InfoActivities.ArrayActivity2;
import com.example.myapplication.Activities.InfoActivities.Feedback;
import com.example.myapplication.Helpers.Compile;
import com.example.myapplication.R;

public class ArrayActivity extends AppCompatActivity {
    private Button feeding, practice;Compile ass = new Compile();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);
        practice=findViewById(R.id.practiceArr);
        feeding=findViewById(R.id.bugBtn9);

        practice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                ass.setLooping(1);
                Intent vb = new Intent(getApplicationContext(), ArrayActivity2.class);
                startActivity(vb);

            }
        });
        feeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Feedback.class);
                startActivity(a);
            }
        });
    }
}
