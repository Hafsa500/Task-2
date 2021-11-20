package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView name, rollno,session,department;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name=findViewById(R.id.getname);
        rollno=findViewById(R.id.getrollno);
        session=findViewById(R.id.getsession);
        department=findViewById(R.id.getdepartment);

        Intent intent =getIntent();
        String Name=intent.getStringExtra("N");
        String Rollno=intent.getStringExtra("R");
        String Session=intent.getStringExtra("S");
        String Department=intent.getStringExtra("D");

        name.setText(Name);
        rollno.setText(Rollno);
        session.setText(Session);
        department.setText(Department);

    }
}