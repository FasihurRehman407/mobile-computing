package com.example.crudapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class UpdateDeleteActivity extends AppCompatActivity {
    EditText t1,t2;
    Button btnU , btnD;
    Switch s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_delete);
        t1=findViewById(R.id.updateName);
        t2=findViewById(R.id.updateRollno);
        s=findViewById(R.id.switchUpdate);
        Intent i = getIntent();
        String name=i.getStringExtra("name");
        String rollNo=i.getStringExtra("rollNo");
        String enroll=i.getStringExtra("enroll");
        t1.setText(name);
        t2.setText(rollNo);
        s.setText(enroll);
    }
}