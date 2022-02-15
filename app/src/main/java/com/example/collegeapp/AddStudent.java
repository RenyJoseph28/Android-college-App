package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudent extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton b1,b2;
    String getName,getRoll,getAd,getClg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        ed1=(EditText) findViewById(R.id.nam);
        ed2=(EditText) findViewById(R.id.roll);
        ed3=(EditText) findViewById(R.id.adm);
        ed4=(EditText) findViewById(R.id.col);
        b1=(AppCompatButton) findViewById(R.id.sub);
        b2=(AppCompatButton) findViewById(R.id.bac);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                getRoll=ed2.getText().toString();
                getAd=ed3.getText().toString();
                getClg=ed4.getText().toString();
                Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getRoll,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getAd,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getClg,Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });

    }
}