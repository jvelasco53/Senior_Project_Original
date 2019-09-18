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
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

public class RegisterActivity extends AppCompatActivity {

    private EditText userEmail, userPassowrd, userPassowrd2, userName;
    private ProgressBar loadingProgress;
    private Button button, feeding;
    private FirebaseAuth mAuth;
    private FirebaseFirestore mFirestore;
    private Button loginb;
    private DatabaseReference reff;
    private Member member;
    private String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        userEmail = findViewById(R.id.etEmail);
        userPassowrd = findViewById(R.id.regPassword);
        userPassowrd2 = findViewById(R.id.regPassword2);
        userName = findViewById(R.id.name);
        button = findViewById(R.id.register);
        loadingProgress = findViewById(R.id.progressBar);

        mAuth = FirebaseAuth.getInstance();
        loginb = findViewById(R.id.loginbutton);
        feeding=findViewById(R.id.bugBtn6);
        mFirestore= FirebaseFirestore.getInstance();
        reff = FirebaseDatabase.getInstance().getReference().child("Member");
        member = new Member();
        FirebaseUser USER = mAuth.getCurrentUser();
        user=USER.getUid();




        loadingProgress.setVisibility(View.INVISIBLE);

        feeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Feedback.class);
                startActivity(a);
            }
        });

        loginb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginp = new Intent(getApplicationContext(), Login1Activity.class);
                startActivity(loginp);
            }
        });

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                button.setVisibility(View.INVISIBLE);
                loadingProgress.setVisibility(View.VISIBLE);
                final String email = userEmail.getText().toString();
                final String password = userPassowrd.getText().toString();
                final String password2 = userPassowrd2.getText().toString();
                final String name = userName.getText().toString();



                member.setUser(name);
                member.setArray(0);
                member.setBranching(0);
                member.setLogical(0);
                member.setLoops(0);
                member.setType(0);
                member.setPrint(0);
                member.setRelational(0);
                reff.child(user).setValue(member);




                
                if (email.isEmpty() || name.isEmpty() || password.isEmpty() || !password.equals(password2)){
                    showMessage("Please verify all fields");
                    button.setVisibility(View.VISIBLE);
                    loadingProgress.setVisibility(View.INVISIBLE);
                }
                else{
                    CreateUserAccount(email,name,password);

                }
                
                
            }
        });
    }

    private void CreateUserAccount(String email, String name, String password) {
         mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
             @Override
             public void onComplete(@NonNull Task<AuthResult> task) {
                 if(task.isSuccessful()){
                     showMessage("Account created");
                     Intent homeActivity = new Intent(getApplicationContext(), mainActivity.class);
                     startActivity(homeActivity);
                 }
                 else{
                     showMessage("account creation failed" + task.getException().getMessage());
                     button.setVisibility(View.VISIBLE);
                     loadingProgress.setVisibility(View.INVISIBLE);
                 }
             }
         });
    }

    private void showMessage(String message1) {
        Toast.makeText(getApplicationContext(),message1,Toast.LENGTH_LONG).show();
    }
    public String getName(){
        final String name = userName.getText().toString();
        return name;
    }
}
