package com.example.patientapp.ui.emergency;

import android.os.Bundle;
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

import com.example.patientapp.R;

import java.util.ArrayList;
import java.util.List;

public class EmergencyFragment extends Fragment {

    private EmergencyViewModel emergencyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        ListView contactsList = (ListView)getView().findViewById(R.id.emergencyContactsList);
//        ArrayList<String> contacts = new ArrayList<String>();
//
//        contacts.add("Apurva");
//        contacts.add("Nirvi");
//        contacts.add("Shruti");
//        contacts.add("Swapnil");

        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contacts);
        emergencyViewModel =
                ViewModelProviders.of(this).get(EmergencyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_emergency, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        emergencyViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}