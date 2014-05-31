package com.codefp.android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.codefp.android.activity.MenuActivity;
import com.codefp.android.fragment.HomeFragment;


public class HomeActivity extends MenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new HomeFragment()).commit();

    }

    public void changeFragment( Fragment myNewFragment) {
        FragmentTransaction t = getSupportFragmentManager().beginTransaction();
        t.replace(R.id.content_frame, myNewFragment);
//        t.addToBackStack("fragmentoA");
        t.addToBackStack(null);

        t.commit();
    }
}