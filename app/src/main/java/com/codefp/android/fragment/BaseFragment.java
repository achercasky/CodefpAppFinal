package com.codefp.android.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import java.util.Stack;

/**
 * Created by achercasky on 2/27/14.
 */
public class BaseFragment extends Fragment {
    private Stack<String> fragmentStack;
    public int count;


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        fragmentStack = new Stack<String>();
    }


//    @Override
//    public void onStart() {
//        super.onStart();
//        EasyTracker.getInstance().activityStart(getActivity());
//    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//        EasyTracker.getInstance().activityStop(getActivity());
//    }

    protected void showFragment(int resId, Fragment fragment, String tag, boolean addToBackStack) {

        FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (!fragmentStack.isEmpty()) {

            String lastFragmentTag = fragmentStack.lastElement();

            if (!tag.equals(lastFragmentTag)) {

                android.support.v4.app.Fragment lastFragment = fm.findFragmentByTag(lastFragmentTag);
                if (lastFragment != null) {

                    ft.hide(lastFragment);
                }

                if (fragmentStack.contains(tag)) {

                    fragment = fm.findFragmentByTag(tag);

                    ft.show(fragment);

                    ft.commit();

                } else {

                    this.checkAddToBackStack(addToBackStack, fm, ft, tag, fragment, resId);

                    ft.commit();

                    fragmentStack.push(tag);
                }
            }
        } else {

            this.checkAddToBackStack(addToBackStack, fm, ft, tag, fragment, resId);

            ft.commit();

            fragmentStack.push(tag);
        }
    }

    private void checkAddToBackStack(Boolean addToBackStack, FragmentManager fm, FragmentTransaction ft, String tag, Fragment fragment, int resId) {

        if (addToBackStack) {

            ft.add(resId, fragment, tag);
            ft.addToBackStack(null);

        } else {

            ft.replace(resId, fragment, tag);
            fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);

            fragmentStack.clear();
        }
    }



}
