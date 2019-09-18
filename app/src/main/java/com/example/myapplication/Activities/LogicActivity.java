package com.example.myapplication.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.Activities.InfoActivities.Feedback;
import com.example.myapplication.Activities.InfoActivities.LogicalActivity;
import com.example.myapplication.Activities.InfoActivities.RelationalActivity;
import com.example.myapplication.R;
//this is the operations relational and logical
public class LogicActivity extends AppCompatActivity {
    Button rela, logic,feeding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logic);
        rela = findViewById(R.id.relationalBtn);
        logic = findViewById(R.id.LogicalBtn2);
        feeding=findViewById(R.id.bugBtn13);

        feeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Feedback.class);
                startActivity(a);
            }
        });

        rela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rela1 = new Intent(getApplicationContext(), RelationalActivity.class);
                startActivity(rela1);
            }
        });
        logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logic1 = new Intent(getApplicationContext(), LogicalActivity.class);
                startActivity(logic1);
            }
        });
    }
}
