package com.amirmohammed.ultras11jul.ui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.amirmohammed.ultras11jul.R;
import com.amirmohammed.ultras11jul.human.Days;
import com.amirmohammed.ultras11jul.human.Human;
import com.amirmohammed.ultras11jul.human.MyStudent;
import com.amirmohammed.ultras11jul.models.MyUser;

public class MainActivity extends AppCompatActivity {

    TextView textViewEmail;

    Button buttonAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAddress = findViewById(R.id.btn_address);

        textViewEmail = findViewById(R.id.main_screen_tv_email);

        registerForContextMenu(textViewEmail);

//        String email = getIntent().getStringExtra("email");
//
//        textViewEmail.setText(email);
//
//        MyUser myUser = (MyUser) getIntent().getSerializableExtra("user");
//
//        System.out.println(myUser.getAge());
//        System.out.println(myUser.getName());
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.item_copy_text){
            Toast.makeText(this, "Copy text", Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }

    public void openSelectAddress(View view) {
        Intent intent = new Intent(
                MainActivity.this,
                SelectAddressActivity.class);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK && data != null) {
            String address = data.getStringExtra("address");
            buttonAddress.setText(address);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optioal_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.item_search) {
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.item_notifications) {
            Toast.makeText(this, "Notifications", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.item_logout) {
            Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}
