package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddFaculty extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5;
AppCompatButton b1,b2;
String getFac,getDep,getQua,getMob,getEm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty);
        ed1=(EditText) findViewById(R.id.fac);
        ed2=(EditText) findViewById(R.id.dep);
        ed3=(EditText) findViewById(R.id.qua);
        ed4=(EditText) findViewById(R.id.mob);
        ed5=(EditText) findViewById(R.id.em);
        b1=(AppCompatButton) findViewById(R.id.suu);
        b2=(AppCompatButton) findViewById(R.id.baa);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFac=ed1.getText().toString();
                getDep=ed2.getText().toString();
                getQua=ed3.getText().toString();
                getMob=ed4.getText().toString();
                getEm=ed5.getText().toString();
                Toast.makeText(getApplicationContext(), getFac, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getDep,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getQua,Toast.LENGTH_SHORT).show();;
                Toast.makeText(getApplicationContext(),getMob,Toast.LENGTH_SHORT).show();;
                Toast.makeText(getApplicationContext(),getEm,Toast.LENGTH_SHORT).show();;

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