package com.example.cwresturant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cwresturant.adapter.FoodAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FoodAdapter foodAdapter;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.descriptionFoodName);
        recyclerView = findViewById(R.id.foodRV);

        ArrayList<Food> foodList = new ArrayList<>();
        Food Burger = new Food("Burger", "Naga Burger with beef", 350, "+9186454","nagaburger@gmail.com",
                "www.wegrapps.com", R.drawable.food1);
        Food Pizza = new Food("Pizza", "Chicken Pizza 22inch",850, "+9186564454","nagaburger@gmail.com",
                "www.wegrapps.com",R.drawable.food4);

        foodList.add(Burger);
        foodList.add(Pizza);


        foodAdapter = new FoodAdapter(this, foodList);




        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(foodAdapter);
    }
}