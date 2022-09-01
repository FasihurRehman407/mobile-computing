package com.example.quranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.quranapp.R;

public class SurahDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_detail);
        Intent i = getIntent();
        String name=i.getStringExtra("name");
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }
}