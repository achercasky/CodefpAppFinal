package com.codefp.android.item;

import android.support.v4.app.Fragment;

import com.codefp.android.HomeActivity;
import com.codefp.android.interfaces.LoadContent;
import com.codefp.android.model.MenuOptions;


/**
 * Created by achercasky on 5/26/14.
 */
public class ItemHome extends MenuOptions implements LoadContent {
    @Override
    public void load(HomeActivity activity) {

        Fragment fragment = Fragment.instantiate(activity, "fragment.HomeFragment");
        activity.changeFragment(fragment);

    }
}
