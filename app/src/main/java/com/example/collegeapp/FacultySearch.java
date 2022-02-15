package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FacultySearch extends AppCompatActivity {
    EditText ed1;
    AppCompatButton b1,b2;
    String getFac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_search);
        ed1=(EditText)findViewById(R.id.facn);
        b1=(AppCompatButton) findViewById(R.id.se);
        b2=(AppCompatButton) findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFac=ed1.getText().toString();
                Toast.makeText(getApplicationContext(), getFac, Toast.LENGTH_SHORT).show();
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