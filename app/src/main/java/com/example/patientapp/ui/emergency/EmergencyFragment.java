package com.example.patientapp.ui.emergency;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.patientapp.R;
import com.example.patientapp.ui.MyAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmergencyFragment extends Fragment {

    private EmergencyViewModel emergencyViewModel;
    RecyclerView recyclerView;

    List<String> list = new ArrayList<>();
    MyAdapter adapter = null;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        emergencyViewModel =
                ViewModelProviders.of(this).get(EmergencyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_emergency, container, false);

        recyclerView = (RecyclerView) root.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext())); //check

        for(int i=0; i<5; i++){

            list.add("Hello");
            list.add("World");
        }

//        Log.i("Info", String.valueOf(list));

        adapter = new MyAdapter(this.getContext(),list); //check

        recyclerView.setAdapter(adapter);
        return root;
    }

}