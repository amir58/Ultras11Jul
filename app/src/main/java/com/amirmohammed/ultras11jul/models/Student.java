package com.amirmohammed.ultras11jul.models;

public class Student {

    private static int counter = 0;
    public static String branch;
    private final String name;
    private final int id;


    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        counter++;

        System.out.println(counter);
    }

    public Student(int id, String name) {
        this.name = name;
        this.id = id;
        counter++;

        System.out.println(counter);
    }


    void test() {

    }

    void test(int x) {

    }

    void test(double y) {

    }

    void test(long y) {

    }

    void test(String y) {

    }

    void test(int x, int y) {

    }

    void test(int x, double y) {

    }

    void test(double x, int y) {

    }

    void test(double x, double y) {

    }


}
