package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LessonInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_info);
        Intent intent = getIntent();
        String message = intent.getStringExtra("Aa");
        TextView textView = findViewById(R.id.textView3);
        textView.setText(message);
    }
}