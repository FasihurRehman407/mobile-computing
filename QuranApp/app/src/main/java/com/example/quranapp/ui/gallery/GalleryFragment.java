package com.example.quranapp.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.quranapp.DbHelper;
import com.example.quranapp.R;
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
        return contentView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}