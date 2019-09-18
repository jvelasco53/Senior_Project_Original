package com.example.myapplication.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.Activities.InfoActivities.BranchPractice1;
import com.example.myapplication.Activities.InfoActivities.Feedback;
import com.example.myapplication.Helpers.Compile;
import com.example.myapplication.R;

public class BranchingActivity extends AppCompatActivity {
    private Button feeding,branchPractice;
    public Compile ass = new Compile();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branching);
        setContentView(R.layout.activity_branching1);
        feeding=findViewById(R.id.bugBtn10);
        branchPractice=findViewById(R.id.brachBtnPractice);

        feeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Feedback.class);
                startActivity(a);
            }
        });
        branchPractice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent b = new Intent(getApplicationContext(), BranchPractice1.class);
                startActivity(b);
            }

        });
        ass.setBranching(1);

    }
}
