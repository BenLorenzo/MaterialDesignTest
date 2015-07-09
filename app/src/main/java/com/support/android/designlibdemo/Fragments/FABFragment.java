package com.support.android.designlibdemo.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.support.android.designlibdemo.Adapter.Adapter;
import com.support.android.designlibdemo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FABFragment extends Fragment {

    View view;

    public FABFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fab, container, false);
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"you click fab",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
