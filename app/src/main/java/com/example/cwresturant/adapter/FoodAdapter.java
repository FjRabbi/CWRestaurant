package com.example.cwresturant.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cwresturant.Description;
import com.example.cwresturant.R;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private ArrayList<String> foodList;
    private Context context;

    public FoodAdapter(ArrayList<String> foodList, Context context) {
        this.foodList = foodList;
        this.context = context;
    }


    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item_design, parent, false);
        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.price.setText(foodList.get(position));

        holder.foodImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Description.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder{

        TextView price;
        ImageView foodImage;
        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            price = itemView.findViewById(R.id.itemPrice);
            foodImage = itemView.findViewById(R.id.itemImage);
        }
    }

}
