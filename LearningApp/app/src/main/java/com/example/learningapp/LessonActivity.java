package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        findViewById(R.id.buttonA).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.buttonB).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.buttonC).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.buttonB).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.buttonB).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.buttonB).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.buttonB).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.buttonB).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.buttonB).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.buttonB).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.buttonB).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.buttonB).setOnClickListener((View.OnClickListener) this);
    }
    public void onClick(View v) {

        switch (v.getId()){

            // cases applied over different buttons
            case R.id.button:

                // Toast message appears when button pressed
                Toast.makeText(this, "button1 pressed", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button2:

                Toast.makeText(this, "button2 pressed", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button3:

                Toast.makeText(this, "button3 pressed", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}