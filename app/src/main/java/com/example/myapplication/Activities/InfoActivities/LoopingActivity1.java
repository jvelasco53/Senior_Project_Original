package com.example.myapplication.Activities.InfoActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.Activities.PracticeActivities.LoopingActivity2;
import com.example.myapplication.R;

import static java.util.regex.Pattern.compile;

public class LoopingActivity1 extends AppCompatActivity {

    private Button runn;
    private EditText code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looping1);
        code.findViewById(R.id.loopString1);
        runn.findViewById(R.id.runLoop1);

        runn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String v = "public class Loop1 {" +
                        " public static void cars(Integer n) { " +
                         code.toString() +
                        "}" +
                        "}";

                if(compile(v)!=null) {
                    Intent a = new Intent(getApplicationContext(), LoopingActivity2.class);
                    startActivity(a);
                }
                }
            });
    }
}
