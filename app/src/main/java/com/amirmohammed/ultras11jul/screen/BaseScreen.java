package com.amirmohammed.ultras11jul.screen;

public class BaseScreen {

   public final boolean isNetworkAvailable() {
        return true;
    }

    public  void startLoading() {
        System.out.println("Loading start");
    }

    public void stopLoading() {
        System.out.println("Loading stop");
    }

}
