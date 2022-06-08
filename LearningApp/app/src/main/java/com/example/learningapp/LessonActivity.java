package com.example.learningapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable =
                new ColorDrawable(Color.parseColor("#F50057"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);
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
        String message , src ;
        switch (v.getId()){

            case R.id.buttonA:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                src = "apple";
                i.putExtra("text", "A for Apple");
                i.putExtra("img", src);
                startActivity(i);
                break;

            case R.id.buttonB:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "B";
                i.putExtra("Bb", message);
                startActivity(i);
                break;
                case R.id.buttonC:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "C";
                i.putExtra("Cc", message);
                startActivity(i);
                break;
                case R.id.buttonD:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "D";
                i.putExtra("Dd", message);
                startActivity(i);
                break;
                case R.id.buttonE:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "A for apple";
                i.putExtra("Ee", message);
                startActivity(i);
                break;
                case R.id.buttonF:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "F";
                i.putExtra("Ff", message);
                startActivity(i);
                break;
                case R.id.buttonG:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "G";
                i.putExtra("Gg", message);
                startActivity(i);
                break;
                case R.id.buttonH:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "H";
                i.putExtra("Hh", message);
                startActivity(i);
                break;
                case R.id.buttonI:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "I";
                i.putExtra("Ii", message);
                startActivity(i);
                break;
                case R.id.buttonJ:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "J";
                i.putExtra("Jj", message);
                startActivity(i);
                break;
                case R.id.buttonK:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "K";
                i.putExtra("Kk", message);
                startActivity(i);
                break;
                case R.id.buttonL:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "L";
                i.putExtra("Ll", message);
                startActivity(i);
                break;
                case R.id.buttonM:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "M";
                i.putExtra("Mm", message);
                startActivity(i);
                break;
                case R.id.buttonN:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "N";
                i.putExtra("Nn", message);
                startActivity(i);
                break;
                case R.id.buttonO:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "O";
                i.putExtra("Oo", message);
                startActivity(i);
                break;
            case R.id.buttonP:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "P";
                i.putExtra("Pp", message);
                startActivity(i);
                break;
            case R.id.buttonQ:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "Q";
                i.putExtra("Qq", message);
                startActivity(i);
                break;
            case R.id.buttonR:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "R";
                i.putExtra("Rr", message);
                startActivity(i);
                break;
            case R.id.buttonS:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "S";
                i.putExtra("Ss", message);
                startActivity(i);
                break;
            case R.id.buttonT:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "T";
                i.putExtra("Tt", message);
                startActivity(i);
                break;
            case R.id.buttonU:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "U";
                i.putExtra("Uu", message);
                startActivity(i);
                break;
            case R.id.buttonV:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "V";
                i.putExtra("Vv", message);
                startActivity(i);
                break;
            case R.id.buttonW:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "W";
                i.putExtra("Ww", message);
                startActivity(i);
                break;
            case R.id.buttonX:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "X";
                i.putExtra("Xx", message);
                startActivity(i);
                break;
            case R.id.buttonY:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "Y";
                i.putExtra("Yy", message);
                startActivity(i);
                break;
            case R.id.buttonZ:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                message = "Z";
                i.putExtra("Zz", message);
                startActivity(i);
                break;
        }
    }
}