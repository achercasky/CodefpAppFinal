package com.codefp.android.model;

import com.codefp.android.interfaces.LoadContent;

/**
 * Created by achercasky on 5/26/14.
 */
public abstract class MenuOptions implements LoadContent{

    private String name;
    private Integer imageMenu;

    public Integer getImageMenu() {
        return imageMenu;
    }

    public void setImageMenu(Integer imageMenu) {
        this.imageMenu = imageMenu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
