package com.amirmohammed.ultras11jul.models;

public class MyUser {
    // accessModifier nonAccessModifiers dataType name
    private final String id;
    private String name;
    private String email;
    private int age;

    public MyUser(String id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 1) {
            this.name = name;
        } else {
            this.name = "Unknown";
            System.out.println("Wrong name");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Wrong age");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printUserData() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Email : " + this.email);
    }

}
