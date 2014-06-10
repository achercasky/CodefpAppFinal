package com.codefp.android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.codefp.android.activity.MenuActivity;
import com.codefp.android.fragment.HomeFragment;
import com.manuelpeinado.fadingactionbar.FadingActionBarHelper;


public class HomeActivity extends MenuActivity {

    private String [] strings = {"lala","lala","lala","lala","lala","lala","lala","lala","lala","lala","lala","lala","lala"
            ,"lala","lala","lala","lala","lala","lala","lala","lala","lala","lala","lala","lala"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        FadingActionBarHelper helper = new FadingActionBarHelper()
                .actionBarBackground(R.drawable.ab_background)
                .headerLayout(R.layout.header)
                .contentLayout(R.layout.activity_listview);
        setContentView(helper.createView(this));
        helper.initActionBar(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, strings);

        ListView listView = (ListView) findViewById(android.R.id.list);
        listView.setAdapter(adapter);

//        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new HomeFragment()).commit();

    }

    public void changeFragment( Fragment myNewFragment) {
        FragmentTransaction t = getSupportFragmentManager().beginTransaction();
        t.replace(R.id.content_frame, myNewFragment);
//        t.addToBackStack("fragmentoA");
        t.addToBackStack(null);

        t.commit();
    }
}