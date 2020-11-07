package com.example.dd2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.firebase.auth.FirebaseAuth;

public class NGO_List extends AppCompatActivity {

    LinearLayout l,l1,l2,l3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_g_o__list2);

        l=findViewById(R.id.ButtonLayout);

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToMain = new Intent(NGO_List.this, Profile.class );
                startActivity(intToMain);
            }
        });

        l1=findViewById(R.id.ButtonLayout1);

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToMain = new Intent(NGO_List.this, Profile.class );
                startActivity(intToMain);
            }
        });

        l2=findViewById(R.id.ButtonLayout2);

        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToMain = new Intent(NGO_List.this, Profile.class );
                startActivity(intToMain);
            }
        });

        l3=findViewById(R.id.ButtonLayout3);

        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToMain = new Intent(NGO_List.this, Profile.class );
                startActivity(intToMain);
            }
        });
    }
}