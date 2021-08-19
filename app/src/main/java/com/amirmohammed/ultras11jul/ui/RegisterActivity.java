package com.amirmohammed.ultras11jul.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.amirmohammed.ultras11jul.models.MyClass;
import com.amirmohammed.ultras11jul.R;
import com.amirmohammed.ultras11jul.models.MyUser;

public class RegisterActivity extends AppCompatActivity {

    EditText editTextEmail;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextEmail = findViewById(R.id.et_email);

        editTextPassword = findViewById(R.id.et_password);

        MyClass myObject = new MyClass();
        myObject.printMyName();

        MyUser myUser = new MyUser("id", "Amir","amir@gmail.com",21);
        myUser.printUserData();

        MyUser myUser2 = new MyUser("id", "Mohamed", "mohamed@gmail.com", 22);
        myUser2.printUserData();

        MyUser myUser3 = new MyUser("id", "Ali", "ali@gmail.com", 18);
        myUser3.printUserData();

//        String username1= "";
//        String username2 ="";
//        String email1= "";
//        String email2= "";
//        int age1= 0 ;
//        int age2=0;
//
//        System.out.println("Name : " + username1);
//        System.out.println("Age : " + age1);
//        System.out.println("Email : " + email1);
//
//        System.out.println("Name : " + username2);
//        System.out.println("Age : " + age2);
//        System.out.println("Email : " + email2);


    }

    public void register(View view) {
        String email = editTextEmail.getText().toString();

        System.out.println(email);
    }
}