package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LessonActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        findViewById(R.id.buttonA).setOnClickListener(this);
        findViewById(R.id.buttonB).setOnClickListener(this);
        findViewById(R.id.buttonC).setOnClickListener(this);
        findViewById(R.id.buttonD).setOnClickListener(this);
        findViewById(R.id.buttonE).setOnClickListener(this);
        findViewById(R.id.buttonF).setOnClickListener( this);
        findViewById(R.id.buttonG).setOnClickListener(this);
        findViewById(R.id.buttonH).setOnClickListener(this);
        findViewById(R.id.buttonI).setOnClickListener(this);
        findViewById(R.id.buttonJ).setOnClickListener(this);
        findViewById(R.id.buttonK).setOnClickListener(this);
        findViewById(R.id.buttonL).setOnClickListener( this);
        findViewById(R.id.buttonM).setOnClickListener( this);
        findViewById(R.id.buttonN).setOnClickListener(this);
        findViewById(R.id.buttonO).setOnClickListener( this);
        findViewById(R.id.buttonP).setOnClickListener(this);
        findViewById(R.id.buttonQ).setOnClickListener( this);
        findViewById(R.id.buttonR).setOnClickListener( this);
        findViewById(R.id.buttonS).setOnClickListener(this);
        findViewById(R.id.buttonT).setOnClickListener(this);
        findViewById(R.id.buttonU).setOnClickListener(this);
        findViewById(R.id.buttonV).setOnClickListener(this);
        findViewById(R.id.buttonW).setOnClickListener(this);
        findViewById(R.id.buttonX).setOnClickListener(this);
        findViewById(R.id.buttonY).setOnClickListener(this);
        findViewById(R.id.buttonZ).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        Intent i;
        String message;
        switch (v.getId()){

            case R.id.buttonA:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "A for apple";
                i.putExtra("Aa", message);
                startActivity(i);
                break;

            case R.id.buttonB:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "B";
                i.putExtra("Bb", message);
                startActivity(i);
                break;    case R.id.buttonC:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "C";
                i.putExtra("Cc", message);
                startActivity(i);
                break;    case R.id.buttonD:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "D";
                i.putExtra("Dd", message);
                startActivity(i);
                break;    case R.id.buttonE:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "A for apple";
                i.putExtra("Ee", message);
                startActivity(i);
                break;    case R.id.buttonF:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "F";
                i.putExtra("Ff", message);
                startActivity(i);
                break;    case R.id.buttonG:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "G";
                i.putExtra("Aa", message);
                startActivity(i);
                break;    case R.id.buttonB:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "A for apple";
                i.putExtra("Aa", message);
                startActivity(i);
                break;    case R.id.buttonB:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "A for apple";
                i.putExtra("Aa", message);
                startActivity(i);
                break;    case R.id.buttonB:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "A for apple";
                i.putExtra("Aa", message);
                startActivity(i);
                break;    case R.id.buttonB:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "A for apple";
                i.putExtra("Aa", message);
                startActivity(i);
                break;    case R.id.buttonB:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "A for apple";
                i.putExtra("Aa", message);
                startActivity(i);
                break;    case R.id.buttonB:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "A for apple";
                i.putExtra("Aa", message);
                startActivity(i);
                break;    case R.id.buttonB:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "A for apple";
                i.putExtra("Aa", message);
                startActivity(i);
                break;    case R.id.buttonB:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "A for apple";
                i.putExtra("Aa", message);
                startActivity(i);
                break;
        }
    }
}