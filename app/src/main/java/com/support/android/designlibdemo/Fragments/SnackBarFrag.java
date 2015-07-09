package com.support.android.designlibdemo.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.support.android.designlibdemo.Presenter.SnackbarFragPresenter;
import com.support.android.designlibdemo.PresenterImpl.SnackBarFragPresenterImpl;
import com.support.android.designlibdemo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SnackBarFrag extends Fragment {

    View view;
    SnackbarFragPresenter snackbarFragPresenter;
    FloatingActionButton fab;

    public SnackBarFrag() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        snackbarFragPresenter = new SnackBarFragPresenterImpl(getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_snack_bar, container, false);
        fab = (FloatingActionButton) view.findViewById(R.id.snackbar_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        return view;
    }



}
