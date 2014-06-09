package com.codefp.android.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by ariel on 11/05/14.
 */
public abstract class BaseActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);//true
        getSupportActionBar().setHomeButtonEnabled(false);//true

    }
}
