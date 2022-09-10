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
                src = "bat";
                i.putExtra("text", "B for Bat");
                i.putExtra("img", src);
                startActivity(i);
                break;
                case R.id.buttonC:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                src = "cat";
                i.putExtra("text","C for Cat");
                i.putExtra("img", src);
                startActivity(i);
                break;
                case R.id.buttonD:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                    src = "dog";
                    i.putExtra("text","D for Dog");
                    i.putExtra("img", src);
                startActivity(i);
                break;
                case R.id.buttonE:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                    src = "elephant";
                    i.putExtra("text","E for Elephant");
                    i.putExtra("img", src);
                startActivity(i);
                break;
                case R.id.buttonF:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                    src = "fish";
                    i.putExtra("text","F for Fish");
                    i.putExtra("img", src);
                startActivity(i);
                break;
                case R.id.buttonG:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                    src = "goat";
                    i.putExtra("text","G for Goat");
                    i.putExtra("img", src);
                startActivity(i);
                break;
                case R.id.buttonH:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                    src = "hen";
                    i.putExtra("text","H for Hen");
                    i.putExtra("img", src);
                startActivity(i);
                break;
                case R.id.buttonI:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                    src = "ink";
                    i.putExtra("text","I for Ink");
                    i.putExtra("img", src);
                startActivity(i);
                break;
                case R.id.buttonJ:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                    src = "jug";
                    i.putExtra("text","J for Jug");
                    i.putExtra("img", src);
                startActivity(i);
                break;
                case R.id.buttonK:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                    src = "kite";
                    i.putExtra("text","K for Kite");
                    i.putExtra("img", src);
                startActivity(i);
                break;
                case R.id.buttonL:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                    src = "lamp";
                    i.putExtra("text","L for Lamp");
                    i.putExtra("img", src);
                startActivity(i);
                break;
                case R.id.buttonM:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                    src = "moon";
                    i.putExtra("text","M for Moon");
                    i.putExtra("img", src);
                startActivity(i);
                break;
                case R.id.buttonN:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                    src = "nest";
                    i.putExtra("text","N for Nest");
                    i.putExtra("img", src);
                startActivity(i);
                break;
                case R.id.buttonO:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                    src = "owl";
                    i.putExtra("text","O for Owl");
                    i.putExtra("img", src);
                startActivity(i);
                break;
            case R.id.buttonP:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                src = "pakistan";
                i.putExtra("text","P for Pakistan");
                i.putExtra("img", src);
                startActivity(i);
                break;
            case R.id.buttonQ:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                src = "queen";
                i.putExtra("text","Q for Queen");
                i.putExtra("img", src);
                startActivity(i);
                break;
            case R.id.buttonR:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                src = "rat";
                i.putExtra("text","R for Rat");
                i.putExtra("img", src);
                startActivity(i);
                break;
            case R.id.buttonS:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                src = "snake";
                i.putExtra("text","S for Snake");
                i.putExtra("img", src);
                startActivity(i);
                break;
            case R.id.buttonT:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                src = "truck";
                i.putExtra("text","T for Truck");
                
                startActivity(i);
                break;
            case R.id.buttonU:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                src = "umbrella";
                i.putExtra("text","U for Umbrella");
                i.putExtra("img", src);
                startActivity(i);
                break;
            case R.id.buttonV:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                src = "violin";
                i.putExtra("text","V for Violin");
                i.putExtra("img", src);
                startActivity(i);
                break;
            case R.id.buttonW:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                src = "cat";
                i.putExtra("text","C for Cat");
                i.putExtra("img", src);
                startActivity(i);
                break;
            case R.id.buttonX:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                src = "cat";
                i.putExtra("text","C for Cat");
                i.putExtra("img", src);
                startActivity(i);
                break;
            case R.id.buttonY:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                src = "cat";
                i.putExtra("text","C for Cat");
                i.putExtra("img", src);
                startActivity(i);
                break;
            case R.id.buttonZ:
                i = new Intent(LessonActivity.this , LessonInfo.class);
                src = "cat";
                i.putExtra("text","C for Cat");
                i.putExtra("img", src);
                startActivity(i);
                break;
        }
    }
}