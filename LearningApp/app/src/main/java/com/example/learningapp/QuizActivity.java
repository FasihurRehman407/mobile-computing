package com.example.learningapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class QuizActivity extends AppCompatActivity {
    String[] key= {"b","c","a","d","a","a","d"};
    Button submitBtn;
    RadioGroup g1,g2,g3,g4,g5,g6,g7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable =
                new ColorDrawable(Color.parseColor("#F50057"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);
        g1=(RadioGroup)findViewById(R.id.g1);
        g2=(RadioGroup)findViewById(R.id.g2);
        g3=(RadioGroup)findViewById(R.id.g3);
        g4=(RadioGroup)findViewById(R.id.g4);
        g5=(RadioGroup)findViewById(R.id.g5);
        g6=(RadioGroup)findViewById(R.id.g6);
        g7=(RadioGroup)findViewById(R.id.g7);
        submitBtn = findViewById(R.id.submitQuiz);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}