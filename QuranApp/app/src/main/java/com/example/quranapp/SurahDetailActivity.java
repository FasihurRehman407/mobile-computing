package com.example.quranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.quranapp.R;

import java.util.List;

public class SurahDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_detail);
        Intent i = getIntent();
        String name=i.getStringExtra("name");
        String id = i.getStringExtra("id");
        Log.d("@@@", id);
        ListView listView = findViewById(R.id.detailsView);
        DbHelper dbHelper = new DbHelper(SurahDetailActivity.this);
        List<SurahModel> list = dbHelper.getSurahDetails(Integer.parseInt(id));
        ArrayAdapter ad =new ArrayAdapter(SurahDetailActivity.this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(ad);
    }
}