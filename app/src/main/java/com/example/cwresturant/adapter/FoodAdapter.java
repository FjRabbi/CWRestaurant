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
import com.example.cwresturant.Food;
import com.example.cwresturant.R;

import java.util.List;

/*
public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private ArrayList<Food> foodList;
    private Context context;

    public FoodAdapter(ArrayList<Food> foodList, Context context) {
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

        Food food =  foodList.get(position);
        holder.price.setText(food.getPrice()+"");

        holder.foodImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(context, Description.class);
                intent.putExtra("FOOD_NAME", food.getName());
                context.startActivity(intent);
                //Toast.makeText(context,"Name " + food.getName(),Toast.LENGTH_SHORT).show();
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
*/

public class FoodAdapter extends  RecyclerView.Adapter<FoodAdapter.FoodViewHolder>{

    private Context context;
    private List<Food> foodList;

    public FoodAdapter(Context context, List<Food> foodList) {
        this.context = context;
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.food_item_design,parent,false);
        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

        Food food = foodList.get(position);
        holder.itemPrice.setText(food.getPrice()+"");
        holder.itemImage.setImageResource(food.getFoodImage());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Description.class);

                /*intent.putExtra("FOOD_NAME", food.getName());
                intent.putExtra("FOOD_IMAGE", food.getFoodImage());
                intent.putExtra("FOOD_PRICE", food.getPrice());
                intent.putExtra("FOOD_DESCRIPTION", food.getDescription());*/
                intent.putExtra("Food", food);
                context.startActivity(intent);

            }
        });
    }



    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder{

          TextView itemPrice;
          ImageView itemImage;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            itemPrice = itemView.findViewById(R.id.itemPrice);
            itemImage = itemView.findViewById(R.id.itemImage);
        }
    }
}
