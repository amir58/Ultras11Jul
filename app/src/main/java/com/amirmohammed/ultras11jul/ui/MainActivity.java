package com.amirmohammed.ultras11jul.ui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.amirmohammed.ultras11jul.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    // Data => ArrayList
    // RecyclerView => XML
    // Item => XML
    // Adapter

    ArrayList<String> names = new ArrayList<>();
    RecyclerView recyclerViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addNames();

        recyclerViewName = findViewById(R.id.rv_names);

        NamesAdapter namesAdapter = new NamesAdapter(names);

        recyclerViewName.setAdapter(namesAdapter);
    }

    private void addNames() {
        names.add("Amir");
        names.add("Abdelrhman");
        names.add("Aly");
        names.add("Barakat");
        names.add("Haidy");
        names.add("Hazem");
        names.add("Marawan");
        names.add("Mostafa");
        names.add("Ziad");

    }


}
