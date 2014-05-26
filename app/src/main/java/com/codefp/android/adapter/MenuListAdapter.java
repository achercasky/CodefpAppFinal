package com.codefp.android.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.codefp.android.R;
import com.codefp.android.model.MenuOptions;

import java.util.List;

/**
 * Created by achercasky on 5/26/14.
 */
public class MenuListAdapter extends BaseAdapter {

    private List<MenuOptions> menuOpcionesList;
    private LayoutInflater layoutInflater;

    public MenuListAdapter(Activity activity, List<MenuOptions> menuOpcionesList) {
        this.menuOpcionesList = menuOpcionesList;
        layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return menuOpcionesList.size();
    }

    @Override
    public Object getItem(int i) {
        return menuOpcionesList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if(view == null){
            view = layoutInflater.inflate(R.layout.adapter_drawer_item, viewGroup, false);
            holder = new ViewHolder();

            holder.title = (TextView) view.findViewById(R.id.menu_title_txt);

            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        holder.title.setText(menuOpcionesList.get(i).getName());

        return view;
    }

    static class ViewHolder {
        TextView title;
    }
}
