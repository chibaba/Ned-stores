package com.example.nedtechnologies;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AllFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AllFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myview = inflater.inflate(R.layout.fragment_all, container, false);

        return  myview;
    }
}