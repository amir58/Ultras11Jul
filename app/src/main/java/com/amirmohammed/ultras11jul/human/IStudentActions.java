package com.amirmohammed.ultras11jul.human;

public interface IStudentActions {

    void sleep();

    default void goToSchool(){
        System.out.println("Student go to school");
    }

    public static final int sleepTime = 8;

}
