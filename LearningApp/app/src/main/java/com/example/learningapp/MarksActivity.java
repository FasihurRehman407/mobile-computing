package com.example.learningapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MarksActivity extends AppCompatActivity {
    TextView textView1 , textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks);
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable =
                new ColorDrawable(Color.parseColor("#F50057"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);
        Intent intent = getIntent();
        int total = intent.getIntExtra("marks",0);
        Log.d("!!!", String.valueOf(total));
        textView1=findViewById(R.id.textView15);
        textView2=findViewById(R.id.textView16);
        textView1.setText(String.valueOf(total));
        textView2.setText(String.valueOf((total/7)*100));

    }
}