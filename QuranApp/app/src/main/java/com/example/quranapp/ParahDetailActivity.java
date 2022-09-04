package com.example.quranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ParahDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parah_detail);
        Intent i = getIntent();
        String id=i.getStringExtra("id");
        ListView listView = findViewById(R.id.paraDetailActivity);
        DbHelper dbHelper = new DbHelper(ParahDetailActivity.this);
        List<SurahModel> list = dbHelper.getParaDetails(Integer.parseInt(id));
        ArrayAdapter ad =new ArrayAdapter(ParahDetailActivity.this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(ad);

    }
}