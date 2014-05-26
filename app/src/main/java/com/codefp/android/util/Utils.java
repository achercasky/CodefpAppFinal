package com.codefp.android.util;

import android.content.Context;

import com.codefp.android.model.MenuOptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ariel on 11/05/14.
 */
public class Utils {

    public static List<MenuOptions> readMenuOptionList(Context context) {

        BufferedReader bufferedReader;
        List<MenuOptions> result = new ArrayList<MenuOptions>();
        String mLine;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open("MenuOptions")));
            mLine = bufferedReader.readLine();

            while(mLine != null) {
                String[] s = mLine.split(":");

                MenuOptions menuOptions = null;
                try{
                    menuOptions = (MenuOptions) Class.forName(s[2]).newInstance();
                }catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                menuOptions.setName(s[0]);

                menuOptions.setImageMenu(context.getResources().getIdentifier(s[1], "drawable", context.getPackageName()));
                result.add(menuOptions);
                mLine = bufferedReader.readLine();
            }

            bufferedReader.close();

        }catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
