package com.amirmohammed.ultras11jul.human;

import com.amirmohammed.ultras11jul.screen.BaseScreen;

public class MyStudent extends Human implements  IStudentActions {

    private String id;

    public MyStudent(String name, int age, double weight
            , double height, String id) {
        super(name, age, weight, height);
        this.id = id;
    }

    public void test(){

    }

    @Override
    public void wake() {
        System.out.println("Student wake up");
        goToSchool();
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Id : " + id);
    }

    @Override
    public void sleep() {
        System.out.println("Student go to sleep");
    }

    @Override
    public void breakfast() {

    }

    @Override
    public void launch() {

    }

    @Override
    public void dinner() {

    }
}
