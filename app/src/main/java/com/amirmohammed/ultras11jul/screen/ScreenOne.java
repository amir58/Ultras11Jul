package com.amirmohammed.ultras11jul.screen;

public class ScreenOne extends BaseScreen {

    void build(){
        if(super.isNetworkAvailable()){
            super.startLoading();
            // getData
            // ....
            //....
            //.....
            // data received
            super.stopLoading();
            // show data on ui
        }
        else{

        }
    }




}
