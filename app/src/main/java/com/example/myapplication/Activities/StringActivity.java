package com.example.myapplication.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.Activities.InfoActivities.CommentActivity;
import com.example.myapplication.Activities.InfoActivities.Feedback;
import com.example.myapplication.Activities.InfoActivities.PrintActivity;
import com.example.myapplication.Activities.InfoActivities.TypesVActivity;
import com.example.myapplication.R;

public class StringActivity extends AppCompatActivity {
    private Button typesBtn,commentBtn, printBtn, feeding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string);
        typesBtn = findViewById(R.id.TypesVBtn);
        commentBtn = findViewById(R.id.commentBtn);
        printBtn = findViewById(R.id.printBtn);
        feeding = findViewById(R.id.bugBtn4);

        feeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Feedback.class);
                startActivity(a);
            }
        });

        typesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent types1 = new Intent(getApplicationContext(), TypesVActivity.class);
                startActivity(types1);
            }
        });
        commentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent comment1 = new Intent(getApplicationContext(), CommentActivity.class);
                startActivity(comment1);
            }
        });
        printBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent print1 = new Intent(getApplicationContext(), PrintActivity.class);
                startActivity(print1);
            }
        });
    }

}
