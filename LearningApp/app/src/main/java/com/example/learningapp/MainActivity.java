package com.example.learningapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button lessonBtn , reposBtn , quizBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable =
                new ColorDrawable(Color.parseColor("#F50057"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);
        lessonBtn=findViewById(R.id.lessonBtn);
        reposBtn=findViewById(R.id.reposBtn);
        quizBtn.findViewById(R.id.quizBtn);
        
        quizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                startActivity(intent);
            }
        });
        reposBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.github.com/FasihurRrehman407");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        lessonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LessonActivity.class);
                startActivity(intent);
            }
        });

    }
}