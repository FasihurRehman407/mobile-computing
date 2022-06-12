package com.example.learningapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {
    String[] key= {"Snake","Bat","Quilt","Elephant","Yacht","Goat","Truck"};
    int count;
    ArrayList<String> userOpts = new ArrayList<String>();
    Button submitBtn;
    RadioGroup g1,g2,g3,g4,g5,g6,g7;
    RadioButton btn1 ,btn2 , btn3 ,btn4, btn5,btn6,btn7;
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
        g1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                btn1=findViewById(i);
                userOpts.add((String) btn1.getText());
            }
        });
        g2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                btn2=findViewById(i);
                userOpts.add((String) btn2.getText());
            }
        });
        g3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                btn3=findViewById(i);
                userOpts.add((String) btn3.getText());
            }
        });
        g4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                btn4=findViewById(i);
                userOpts.add((String) btn4.getText());
            }
        });
        g5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                btn5=findViewById(i);
                userOpts.add((String) btn5.getText());
            }
        });
        g6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                btn6=findViewById(i);
                userOpts.add((String) btn6.getText());
            }
        });
        g7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                btn7=findViewById(i);
                userOpts.add((String) btn7.getText());
            }
        });
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < userOpts.size(); i++) {
                    if(userOpts.get(i).matches(key[i])){
                        count++;
                    }
                }
                Intent intent = new Intent(QuizActivity.this, MarksActivity.class);
                intent.putExtra("marks",count);
                startActivity(intent);
            }
        });
    }
}