package com.amirmohammed.ultras11jul.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.amirmohammed.ultras11jul.R;

public class AddActivity extends AppCompatActivity {
    private static final String TAG = "AddActivity"; // logt

    int counter = 0;
    public void onButtonPressed(View view) {
        counter++;
        System.out.println(counter);
    }

    public void onLanguagesClick(View view) {
        PopupMenu popupMenu = new PopupMenu(this, findViewById(R.id.btn_languages));
        popupMenu.getMenuInflater().inflate(R.menu.pop_up_menu, popupMenu.getMenu());
        popupMenu.show();

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.item_arabic){
                    Toast.makeText(AddActivity.this, "Arabic", Toast.LENGTH_SHORT).show();
                }
                
                else if (item.getItemId() == R.id.item_english){
                    Toast.makeText(AddActivity.this, "English", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Log.i(TAG, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }

    public void alert(View view) {
        new AlertDialog.Builder(AddActivity.this)
                .setTitle("Alert dialog")
                .setMessage("Are you sure to exit ? ")
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("Cancel", null)
                .show();
    }
}
