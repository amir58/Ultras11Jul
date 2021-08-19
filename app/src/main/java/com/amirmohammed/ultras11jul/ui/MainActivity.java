package com.amirmohammed.ultras11jul.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amirmohammed.ultras11jul.R;
import com.amirmohammed.ultras11jul.human.Days;
import com.amirmohammed.ultras11jul.human.Human;
import com.amirmohammed.ultras11jul.human.MyStudent;


public class MainActivity extends AppCompatActivity {

    String name = "Amir Mohammed";
    int age = 20;
    double number = 1.5;
    boolean married = false;

    int x;
    int y = 2;

    String[] names = new String[14];

    String operatingSystems[] = {"Android", "iOS"};

    void updateDay(Days days){
        System.out.println(days);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateDay(Days.MONDAY);

        Human human = new Human("",1,1,1) {
            @Override
            public void wake() {

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
        };

        human.wake();

        MyStudent myStudent = new MyStudent("Amir", 20
                ,80, 180, "20136");
        myStudent.printData();
        myStudent.wake();
        myStudent.sleep();

        if (true) return;

//        Student student1 = new Student("A", 1);
//
//        Student student2 = new Student(2, "B");
//
//        Student.branch = "cs";

        System.out.println(Math.PI);

        names[0] = "Amir";
        names[1] = "Ahmed";
        names[13] = "Mohamed";

        int counter = 0;

        while ( counter < names.length){
            System.out.println(names[counter]);
            counter++;
        }

        x = 1;
        // sout
        // اكتب باعربي
        System.out.println(name + "/n " + age + " \n" + number + " " + married);

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Number : " + number);
        System.out.println("Married : " + married);

        sumNumbersAndPrint(5, 10);

        int result = sumNumbers(10, 20);
        System.out.println(result);

        int numberThree = 10;
        numberThree = numberThree + 40;

        numberThree += 40;

        checkOrderState("pending");

        string();
    }


    private void string() {
        String case1 = "amir mohammed";

        System.out.println(case1.isEmpty());

        String replaceAll = case1.replaceAll(" ", "");
        System.out.println(replaceAll);

        String oldPhone = "0111 6036 522";
        String formattedPhone = oldPhone.replaceAll(" ", "");
        System.out.println(oldPhone);
        System.out.println(formattedPhone);

        System.out.println("old phone length => " + oldPhone.length());
        System.out.println("new phone length => " + formattedPhone.length());

        System.out.println(case1.contains("amir"));

        String myName = case1.concat(" Abulaziz");
        System.out.println(myName);

        String myNameUpperCase = myName.toUpperCase();
        System.out.println(myNameUpperCase);
    }

    private void checkOrderState(String orderState) {
        if (orderState.equals("pending")) {
            System.out.println("pending");
        } else if (orderState.equals("onWay")) {
            System.out.println("onWay");
        } else if (orderState.equals("finished")) {
            System.out.println("finished");
        } else if (orderState.equals("returned")) {
            System.out.println("Returned");
        } else if (orderState.equals("refused")) {
            System.out.println("Refused");
        } else {
            System.out.println("Unknown order state");
        }

        switch (orderState) {
            case "pending":
                System.out.println("pending");
                break;
            case "onWay":
                System.out.println("onWay");
                break;
            case "finished":
                System.out.println("finished");
                break;
            case "returned":
                System.out.println("Returned");
                break;
            case "refused":
                System.out.println("Refused");
                break;
            default:
                System.out.println("Unknown order state");
                break;
        }
    }

    private int sumNumbers(int numberOne, int numberTwo) {
        int result = numberOne + numberTwo;
        return result;
    }

    private void sumNumbersAndPrint(int numberOne, int numberTwo) {
        int result = numberOne + numberTwo;

        System.out.println(result);
    }

    public void login(View view) {
        System.out.println("Login pressed");
        Intent intent = new Intent(MainActivity.this, AddActivity.class);
        startActivity(intent);
    }

    public void openRegister(View view) {
        Intent intent= new Intent(MainActivity.this , RegisterActivity.class);
        startActivity(intent);
    }

}