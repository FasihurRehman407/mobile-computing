package com.example.learningapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class QuizActivity extends AppCompatActivity {
    String[] key= {"Snake","Bat","Quilt","Elephant","Yacht","Goat","Truck"};
    String[] userOpts;
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
                Log.d("***", (String) btn1.getText());
                
            }
        });
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int q1=g1.getCheckedRadioButtonId();
                btn1=(RadioButton)findViewById(q1);
                Log.d("***", (String) btn1.getText());
                int q2=g2.getCheckedRadioButtonId();
                btn2=(RadioButton)findViewById(q2);
                int q3=g3.getCheckedRadioButtonId();
                btn3=(RadioButton)findViewById(q3);
                int q4=g4.getCheckedRadioButtonId();
                btn4=(RadioButton)findViewById(q4);
                int q5=g5.getCheckedRadioButtonId();
                btn5=(RadioButton)findViewById(q5);
                int q6=g6.getCheckedRadioButtonId();
                btn6=(RadioButton)findViewById(q6);
                int q7=g7.getCheckedRadioButtonId();
                btn7=(RadioButton)findViewById(q7);




            }
        });
    }
}