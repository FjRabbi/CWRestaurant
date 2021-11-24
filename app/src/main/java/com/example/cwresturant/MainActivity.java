package com.example.cwresturant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cwresturant.adapter.FoodAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FoodAdapter foodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.foodRV);

        ArrayList<String> foodList = new ArrayList<>();
        foodList.add("350Tk");
        foodList.add("550Tk");
        foodList.add("200Tk");
        foodList.add("150Tk");
        foodList.add("700Tk");
        foodList.add("130Tk");
        foodList.add("340Tk");

        foodAdapter = new FoodAdapter(foodList,this);

        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(foodAdapter);
    }
}