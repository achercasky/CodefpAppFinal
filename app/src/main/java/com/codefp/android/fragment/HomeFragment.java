package com.codefp.android.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.codefp.android.R;

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

        initViews();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, strings);


        listNews.setAdapter(adapter);

    }

    private void initViews() {
        listNews = (ListView) getView().findViewById(R.id.listView);
    }
}
