package com.support.android.designlibdemo.PresenterImpl;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Context;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.widget.Toast;

import com.support.android.designlibdemo.Fragments.CollapsingTabLayoutFrag;
import com.support.android.designlibdemo.Fragments.CoordinateLayoutFrag;
import com.support.android.designlibdemo.Fragments.FABFragment;
import com.support.android.designlibdemo.Fragments.HomeFragment;
import com.support.android.designlibdemo.Fragments.SnackBarFrag;
import com.support.android.designlibdemo.Fragments.TabLayoutFrag;
import com.support.android.designlibdemo.Fragments.ToolBarFrag;
import com.support.android.designlibdemo.Presenter.NavigationPresenter;
import com.support.android.designlibdemo.R;

/**
 * Created by Dev on 7/8/2015.
 */
public class NavigationPresenterImpl implements NavigationPresenter {

    FragmentTransaction fragmentTransaction;
    Context context;
    public NavigationPresenterImpl(Context context) {
        this.context = context;
    }

    @Override
    public void setUpDrawerContent(NavigationView navigationView, final DrawerLayout mDrawerLayout,
                                   final FragmentManager fragmentManager, final int container) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        menuItem.setChecked(true);
                        mDrawerLayout.closeDrawers();

                        fragmentTransaction = fragmentManager.beginTransaction();

                        int id = menuItem.getItemId();
                        if(id == R.id.nav_home){
                            HomeFragment homeFragment = new HomeFragment();
                            fragmentTransaction.replace(container,homeFragment);
                        }else if(id == R.id.nav_toolbar){
                            ToolBarFrag toolBarFrag= new ToolBarFrag();
                            fragmentTransaction.replace(container, toolBarFrag);
                        }
                        else if(id == R.id.nav_fab){
                            FABFragment fabFragment= new FABFragment();
                            fragmentTransaction.replace(container, fabFragment);
                        }
                        else if(id == R.id.nav_snakbar){
                            SnackBarFrag snackBarFrag = new SnackBarFrag();
                            fragmentTransaction.replace(container, snackBarFrag);
                        }
                        else if(id == R.id.nav_tablayout){
                            TabLayoutFrag tabLayoutFrag= new TabLayoutFrag();
                            fragmentTransaction.replace(container, tabLayoutFrag);
                        }
                        else if(id == R.id.nav_coordinatelayout){
                            CoordinateLayoutFrag coordinateLayoutFrag= new CoordinateLayoutFrag();
                            fragmentTransaction.replace(container, coordinateLayoutFrag);
                        }
                        else if(id == R.id.nav_collapsingtablayout){
                            CollapsingTabLayoutFrag collapsingTabLayoutFrag= new CollapsingTabLayoutFrag();
                            fragmentTransaction.replace(container, collapsingTabLayoutFrag);
                        }
                        else if(id == R.id.nav_sub_aboutme){
                            Toast.makeText(context,menuItem.getTitle(),Toast.LENGTH_SHORT).show();
                        }
                        else if(id == R.id.nav_sub_contact){
                            Toast.makeText(context,menuItem.getTitle(),Toast.LENGTH_SHORT).show();
                        }

                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();

                        return true;
                    }
                });
    }
}
