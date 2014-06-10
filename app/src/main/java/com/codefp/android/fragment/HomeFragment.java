package com.codefp.android.fragment;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.codefp.android.R;
import com.manuelpeinado.fadingactionbar.FadingActionBarHelper;

/**
 * Created by achercasky on 5/26/14.
 */
public class HomeFragment extends BaseFragment{

    private String [] strings = {"lala","lala","lala","lala","lala","lala","lala","lala","lala","lala","lala","lala","lala"
                               ,"lala","lala","lala","lala","lala","lala","lala","lala","lala","lala","lala","lala"};
    private ListView listNews;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        ActionBar actionBar =  ((ActionBarActivity)getActivity()).getSupportActionBar();
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#330000ff")));
//        actionBar.setStackedBackgroundDrawable(new ColorDrawable(Color.parseColor("#550000ff")));

        initViews();

//        FadingActionBarHelper helper = new FadingActionBarHelper()
//                .actionBarBackground(R.drawable.ab_background)
//                .headerLayout(R.layout.header)
//                .contentLayout(R.layout.activity_listview);
//        getActivity().setContentView(helper.createView(getActivity()));
//        helper.initActionBar(getActivity());

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, strings);


        listNews.setAdapter(adapter);

//        ListView listView = (ListView) getView().findViewById(android.R.id.list);
//        listView.setAdapter(adapter);

    }

    private void initViews() {
        listNews = (ListView) getView().findViewById(R.id.listView);
    }
}
