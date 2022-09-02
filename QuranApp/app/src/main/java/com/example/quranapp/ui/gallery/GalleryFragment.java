package com.example.quranapp.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.quranapp.DbHelper;
import com.example.quranapp.R;
import com.example.quranapp.SurahDetailActivity;
import com.example.quranapp.SurahModel;
import com.example.quranapp.databinding.FragmentGalleryBinding;

import java.util.List;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_gallery, container, false);
        ListView listView = contentView.findViewById(R.id.listview);
        DbHelper dbHelper = new DbHelper(getContext());
        List<SurahModel> list = dbHelper.getAllSurahNames();
        ArrayAdapter ad =new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(ad);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String res = adapterView.getItemAtPosition(i).toString();
                String arr[] =res.split(" ");
                String id= arr[0];
                String name = arr[1];
                Intent intent = new Intent(getContext(), SurahDetailActivity.class);
                intent.putExtra("name",name);
                intent.putExtra("id",id);
                startActivity(intent);

            }
        });

        return contentView;

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}