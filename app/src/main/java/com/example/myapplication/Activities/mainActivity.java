package com.example.myapplication.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.Activities.InfoActivities.Feedback;
import com.example.myapplication.R;

public class mainActivity extends AppCompatActivity {
    private Button stringAct, arrAct,loopsAct, logicAct,branchingAct,feeding,profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringAct = findViewById(R.id.stringbtn);
        arrAct = findViewById(R.id.arraybtn);
        loopsAct = findViewById(R.id.loopsbtn);
        logicAct = findViewById(R.id.logicbtn);
        branchingAct = findViewById(R.id.branchingBtn);
        feeding = findViewById(R.id.bugBtn8);
        profile = findViewById(R.id.profBtn);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(getApplicationContext(),Profile.class);
                startActivity(b);
            }
        });

        feeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Feedback.class);
                startActivity(a);
            }
        });
        stringAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent string1 =  new Intent(getApplicationContext(),StringActivity.class);
                startActivity(string1);

            }
        });
        logicAct.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent logic5 =  new Intent(getApplicationContext(),LogicActivity.class);
                startActivity(logic5);
            }
        });
        loopsAct.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent loop1 =  new Intent(getApplicationContext(),LoopActivity.class);
                startActivity(loop1);
            }
        });
        arrAct.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent array1 =  new Intent(getApplicationContext(),ArrayActivity.class);
                startActivity(array1);
            }
        });
        branchingAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent branch1 = new Intent(getApplicationContext(),BranchingActivity.class);
                startActivity(branch1);
            }
        });


    }
}
