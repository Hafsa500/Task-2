package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,rollno,session,department;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name= findViewById(R.id.name);
        rollno=findViewById(R.id.rollno);
        session=findViewById(R.id.session);
        department=findViewById(R.id.department);
        btn=findViewById(R.id.button);





        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name= name.getText().toString();
                String Rollno= rollno.getText().toString();
                String Session=session.getText().toString();
                String Department =department.getText().toString();
                Intent intent =new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("N",Name);
                intent.putExtra("R",Rollno);
                intent.putExtra("S",Session);
                intent.putExtra("D",Department);
                startActivity(intent);
            }
        });

    }
}