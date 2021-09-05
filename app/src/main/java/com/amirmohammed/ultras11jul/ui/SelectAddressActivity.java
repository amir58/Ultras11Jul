package com.amirmohammed.ultras11jul.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.amirmohammed.ultras11jul.R;

public class SelectAddressActivity extends AppCompatActivity {

    EditText editTextAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_address);

        editTextAddress= findViewById(R.id.et_address);

    }

    public void confirmAddress(View view) {
        String address = editTextAddress.getText().toString();

        if (address.isEmpty()){
            Toast.makeText(this,
                    "Address required",
                    Toast.LENGTH_SHORT).show();
            editTextAddress.setError("Address required");
            return;
        }

        Intent intent = new Intent();
        intent.putExtra("address", address);

        setResult(RESULT_OK, intent);

        finish();
    }
}