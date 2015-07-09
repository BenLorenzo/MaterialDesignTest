package com.support.android.designlibdemo.Fragments;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.support.android.designlibdemo.Adapter.Adapter;
import com.support.android.designlibdemo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabLayoutFrag extends Fragment {

    Context context;
    View view;

    public TabLayoutFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_tab_layout, container, false);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        if(viewPager != null){
            setupViewPager(viewPager);
        }
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.context = activity;
    }

    private void setupViewPager(ViewPager viewPager) {
        Adapter adapter = new Adapter(getActivity().getSupportFragmentManager());
        adapter.addFragment(new ClassTypeFragment(), "Class A");
        adapter.addFragment(new ClassTypeFragment(), "Class B");
        adapter.addFragment(new ClassTypeFragment(), "Class C");
        viewPager.setAdapter(adapter);
    }

}
