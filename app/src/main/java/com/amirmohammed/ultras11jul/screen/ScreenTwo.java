package com.amirmohammed.ultras11jul.screen;

import com.amirmohammed.ultras11jul.screen.BaseScreen;

public class ScreenTwo extends BaseScreen {

    void build() {
        if (super.isNetworkAvailable()) {
            startLoading();

            super.stopLoading();

        } else {
            // show custom dialog
        }
    }

    @Override
    public void startLoading() {
//        super.startLoading();
        System.out.println("Custom dialog");
    }
}
