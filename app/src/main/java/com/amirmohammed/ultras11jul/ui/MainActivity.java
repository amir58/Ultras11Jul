package com.amirmohammed.ultras11jul.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.amirmohammed.ultras11jul.R;
import com.amirmohammed.ultras11jul.human.Days;
import com.amirmohammed.ultras11jul.human.Human;
import com.amirmohammed.ultras11jul.human.MyStudent;
import com.amirmohammed.ultras11jul.models.MyUser;


public class MainActivity extends AppCompatActivity {

    TextView textViewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewEmail = findViewById(R.id.main_screen_tv_email);

        String email = getIntent().getStringExtra("email");

        textViewEmail.setText(email);

        MyUser myUser = (MyUser) getIntent().getSerializableExtra("user");

        System.out.println(myUser.getAge());
        System.out.println(myUser.getName());
    }





}