package com.codefp.android.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.codefp.android.HomeActivity;
import com.codefp.android.interfaces.LoadContent;
import com.codefp.android.model.MenuOptions;

import java.util.List;

/**
 * Created by achercasky on 5/26/14.
 */
public class MenuFragment extends ListFragment{

    private List<MenuOptions> menuOptionsList;
    private int checkPosition;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

//        menuOptionsList = new PersonalService(getActivity()).getMenuOptionsList();
//
//        MenuListAdapter menuListAdapter = new MenuListAdapter(getActivity(), menuOptionsList);
//
//        setListAdapter(menuListAdapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if(savedInstanceState != null)
            checkPosition = savedInstanceState.getInt("position", 0);

        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
//        getListView().setItemChecked(checkPosition, true);
        getListView().setDividerHeight(0);

//        getListView().setSelection(0);
//        getListView().getSelectedView().setSelected(true);


//        getListView().setSelector(R.color.transparent);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("position", checkPosition);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        LoadContent item = (LoadContent) l.getItemAtPosition(position);

//       itemSelected(item);
    }

//    public void itemSelected(final LoadContent item) {
//
//        ((HomeActivity) getActivity()).showContent();
//
//        Handler h = new Handler();
//        h.postDelayed(new Runnable() {
//            public void run() {
//                item.load((MainActivity) getActivity());
//            }
//        }, 300);
//    }

}
