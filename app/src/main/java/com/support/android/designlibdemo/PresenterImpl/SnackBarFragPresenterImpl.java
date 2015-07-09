package com.support.android.designlibdemo.PresenterImpl;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;

import com.support.android.designlibdemo.Presenter.SnackbarFragPresenter;

/**
 * Created by Dev on 7/8/2015.
 */
public class SnackBarFragPresenterImpl implements SnackbarFragPresenter {

    Context context;

    public SnackBarFragPresenterImpl(Context context) {
        this.context = context;
    }

    @Override
    public void showSnackBar(FloatingActionButton floatingActionButton) {

    }
}
