package com.example.myapplication.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Profile extends AppCompatActivity {

    private TextView a,b,c,d,e,f,g,h;
    private Button a1, b2;

    private FirebaseDatabase myFirebaseData;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListen;
    private DatabaseReference reff;
    private String userID;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        b2 = findViewById(R.id.button4);
        //mAuth = FirebaseAuth.getInstance();

        /*a = (TextView)findViewById(R.id.dataName);
        b = (TextView)findViewById(R.id.dataArray);
        c = (TextView)findViewById(R.id.dataBranch);
        d = (TextView)findViewById(R.id.dataLogic);
        e = (TextView)findViewById(R.id.dataLoop);
        f = (TextView)findViewById(R.id.dataPrint);
        g = (TextView)findViewById(R.id.dataRela);
        h = (TextView)findViewById(R.id.dataType);

        a1 = findViewById(R.id.button5);


        FirebaseUser user = mAuth.getCurrentUser();
        userID = user.getUid();*/
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),Report2.class);
                startActivity(a);
            }
        });

       /* a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reff = FirebaseDatabase.getInstance().getReference().child("Memeber");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        String name = dataSnapshot.child("user").getValue().toString();
                        String arr = dataSnapshot.child("array").getValue().toString();
                        String branch = dataSnapshot.child("branching").getValue().toString();
                        String logic = dataSnapshot.child("logical").getValue().toString();
                        String loop = dataSnapshot.child("loops").getValue().toString();
                        String print = dataSnapshot.child("print").getValue().toString();
                        String relational = dataSnapshot.child("relational").getValue().toString();
                        String eh = dataSnapshot.child("type").getValue().toString();

                        a.setText(name);
                        b.setText(arr);
                        c.setText(branch);
                        d.setText(logic);
                        e.setText(loop);
                        f.setText(print);
                        g.setText(relational);
                        h.setText(eh);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });*/

    }


}
