package com.amirmohammed.ultras11jul.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amirmohammed.ultras11jul.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

// Create constructor for array list
// class Holder => define item views
//
public class NamesAdapter extends RecyclerView.Adapter<NamesAdapter.Holder> {

    ArrayList<String> names;
    public NamesAdapter(ArrayList<String> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name, parent, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        String name = names.get(position);
        holder.textViewName.setText(name);
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        TextView textViewName;

        public Holder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.item_name_tv_name);
        }
    }
}
