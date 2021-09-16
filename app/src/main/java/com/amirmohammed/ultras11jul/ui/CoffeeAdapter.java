package com.amirmohammed.ultras11jul.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amirmohammed.ultras11jul.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.CoffeeHolder> {

    ArrayList<CoffeeModel> list;
    ITotalPrice iTotalPrice; // 1

    public CoffeeAdapter(ArrayList<CoffeeModel> coffeeModels, ITotalPrice iTotalPrice) { // 2
        this.list = coffeeModels;
        this.iTotalPrice = iTotalPrice; // 3
    }

    @NonNull
    @Override
    public CoffeeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_coffee, parent, false);
        CoffeeHolder coffeeHolder = new CoffeeHolder(view);
        return coffeeHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CoffeeHolder holder, int position) {
        CoffeeModel coffeeModel = list.get(position);

        holder.textViewQuantity.setText(coffeeModel.quantity + "");
        holder.textViewPrice.setText(coffeeModel.getPrice() + " EGP");
        holder.textViewName.setText(coffeeModel.getName());

        Picasso.get().load(coffeeModel.getImageUrl()).into(holder.imageViewCoffee);

        holder.imageViewPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.get(position).quantity++;
                notifyItemChanged(position);

                calculatePrice(); // 5
            }
        });

        holder.imageViewMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (list.get(position).quantity == 0) return;

                list.get(position).quantity--;
                notifyItemChanged(position);

                calculatePrice(); // 6
            }
        });
    }

    private void calculatePrice(){ // 4
        int totalPrice = 0;

        for (CoffeeModel coffee : list) {
            totalPrice += coffee.getPrice() * coffee.quantity;
        }

        iTotalPrice.onPriceChange(totalPrice);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class CoffeeHolder extends RecyclerView.ViewHolder {
        ImageView imageViewCoffee, imageViewPlus, imageViewMinus;
        TextView textViewName, textViewQuantity, textViewPrice;

        public CoffeeHolder(@NonNull View itemView) {
            super(itemView);
            imageViewCoffee = itemView.findViewById(R.id.item_coffee_iv);
            imageViewPlus = itemView.findViewById(R.id.item_coffee_plus);
            imageViewMinus = itemView.findViewById(R.id.item_coffee_minus);
            textViewName = itemView.findViewById(R.id.item_coffee_name);
            textViewPrice = itemView.findViewById(R.id.item_coffee_price);
            textViewQuantity = itemView.findViewById(R.id.item_coffee_quantity);
        }
    }
}
