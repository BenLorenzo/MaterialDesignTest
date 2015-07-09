package com.support.android.designlibdemo.Presenter;

import android.support.v4.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.widget.FrameLayout;

/**
 * Created by Dev on 7/8/2015.
 */
public interface NavigationPresenter {
    public void setUpDrawerContent(NavigationView navigationView, final DrawerLayout drawerLayout,
                                   FragmentManager fragmentManage, int id);
}
