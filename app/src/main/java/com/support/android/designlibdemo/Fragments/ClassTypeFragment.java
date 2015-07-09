package com.support.android.designlibdemo.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.support.android.designlibdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClassTypeFragment extends Fragment {


    public ClassTypeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_class_type, container, false);
    }


}
