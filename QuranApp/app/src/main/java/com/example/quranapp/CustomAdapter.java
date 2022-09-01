package com.example.quranapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    List<String> items;
    Context context;

    public CustomAdapter(List<String> items, Context c) {
        super();
        this.items = items;
        this.context = c;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return items.get(i).hashCode();
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(this.context);
        textView.setText(items.get(i));
        return textView;
    }
}