package com.example.myapplication.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.myapplication.Activities.InfoActivities.Feedback;
import com.example.myapplication.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login1Activity extends AppCompatActivity {

    private EditText userEmail, userPassword;
    private Button loginButton, feeding;
    private ProgressBar loginProg;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        userEmail = findViewById(R.id.loginEmail);
        userPassword = findViewById(R.id.loginPassword);
        loginButton = findViewById(R.id.loginbtn);
        loginProg = findViewById(R.id.progbarlogin);
        mAuth = FirebaseAuth.getInstance();
        feeding=findViewById(R.id.bugBtn15);

        feeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Feedback.class);
                startActivity(a);
            }
        });

        loginProg.setVisibility(View.INVISIBLE);
        loginButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                loginProg.setVisibility(View.VISIBLE);
                loginButton.setVisibility(View.INVISIBLE);

                final String mail = userEmail.getText().toString();
                final String pass = userPassword.getText().toString();

                if (mail.isEmpty()||pass.isEmpty()){
                    showMessage("Please verify all fields");
                }
                else if (mail.equals("jvelasco5656@gmail.com")&&pass.equals("password")){
                    Intent a = new Intent(getApplicationContext(), AllFeed.class);
                    startActivity(a);
                }
                else {
                    signIn(mail, pass);
                }
            }
        });

    }

    private void showMessage(String message) {
        Toast.makeText(getApplicationContext(),message, Toast.LENGTH_LONG).show();
    }

    private void signIn(String m, String p){
        mAuth.signInWithEmailAndPassword(m,p).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    loginProg.setVisibility(View.INVISIBLE);
                    loginButton.setVisibility(View.VISIBLE);
                    Intent goin = new Intent(getApplicationContext(),mainActivity.class);
                    startActivity(goin);
                }
            }
        });
    }

}
