package com.codefp.android.service;

import android.content.Context;

import com.codefp.android.model.MenuOptions;
import com.codefp.android.util.Utils;

import java.util.List;

/**
 * Created by achercasky on 5/26/14.
 */
public class CodefpService {

    private Context context;
    private static CodefpService instance;

    public static CodefpService getInstance(Context context) {
        if(instance == null)
            instance = new CodefpService(context);
        return instance;
    }

    public CodefpService(Context context) {
        this.context = context;
    }

    //Archivo de Texto

    public List<MenuOptions> getMenuOptionsList() {
        List<MenuOptions> menuOptionsList = Utils.readMenuOptionList(context);

        return menuOptionsList;
    }
}
