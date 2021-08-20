package com.amirmohammed.ultras11jul.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.amirmohammed.ultras11jul.R;

public class LoginActivity extends AppCompatActivity {

    EditText editTextEmail;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail = findViewById(R.id.login_screen_et_email);
        editTextPassword = findViewById(R.id.login_screen_et_password);

    }

    public void login(View view) {
        String email = editTextEmail.getText().toString();

        if (email.isEmpty()) {
            editTextEmail.setError(getString(R.string.email_required));
            return;
        }

        String password = editTextPassword.getText().toString();

        if (password.isEmpty()) {
            editTextPassword.setError(getString(R.string.password_required));
            return;
        }

        if (email.equals("amir@gmail.com") && password.equals("123456")) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.putExtra("email", email);
            startActivity(intent);

        } else {
            Toast.makeText(this, getString(R.string.login_error_message), Toast.LENGTH_SHORT).show();
        }

    }

    public void openRegister(View view) {
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}