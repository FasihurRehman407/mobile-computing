package com.example.crudapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

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
        String id = i.getStringExtra("id");
        t1.setText(name);
        t2.setText(rollNo);
        s.setChecked(Boolean.parseBoolean(enroll));
        btnU = findViewById(R.id.updateBtn);
        btnD = findViewById(R.id.deleteBtn);
        btnU.setOnClickListener(new View.OnClickListener() {
            StudentModel sm;
            @Override
            public void onClick(View view) {
                try {
                    sm = new StudentModel(t1.getText().toString(), Integer.parseInt(t2.getText().toString()), s.isChecked(),Integer.parseInt(id));
                }catch (Exception e){
                    Toast.makeText(UpdateDeleteActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
                DBHelper dbHelper  = new DBHelper(UpdateDeleteActivity.this);
                dbHelper.updateStudent(sm);
                Toast.makeText(UpdateDeleteActivity.this, "Updated", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(UpdateDeleteActivity.this , MainActivity.class);
                startActivity(i);

            }
        });
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper  = new DBHelper(UpdateDeleteActivity.this);
                dbHelper.deleteStudent(id);
                Toast.makeText(UpdateDeleteActivity.this, "Deleted", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(UpdateDeleteActivity.this , MainActivity.class);
                startActivity(i);
            }
        });
    }
}