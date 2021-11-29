package com.example.cwresturant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Description extends AppCompatActivity {

    TextView foodName,foodDescription, foodPrice;
    ImageView foodImage;
    String name, description;
    int price, image;
    Food food;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        foodName = findViewById(R.id.descriptionFoodName);
        foodDescription = findViewById(R.id.descriptionDescription);
        foodPrice = findViewById(R.id.descriptionFoodPrice);
        foodImage = findViewById(R.id.descriptionFoodImage);


        /*name = getIntent().getExtras().getString("FOOD_NAME");
        description = getIntent().getExtras().getString("FOOD_DESCRIPTION");
        price = getIntent().getExtras().getInt("FOOD_PRICE");
        image = getIntent().getExtras().getInt("FOOD_IMAGE");*/
        food = (Food) getIntent().getSerializableExtra("Food");


        foodName.setText(food.getName());
        foodDescription.setText(food.getDescription());
        foodPrice.setText(food.getPrice()+" BDT");
        foodImage.setImageResource(food.getFoodImage());
    }
}