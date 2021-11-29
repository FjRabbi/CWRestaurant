package com.example.cwresturant;

import android.widget.ImageView;

import java.io.Serializable;

public class Food implements Serializable {
    private String name;
    private String description;
    private int price;
    private String contactNumber;
    private String Email;
    private String website;
    private  int FoodImage;


    public Food(String name, String description,int price, String contactNumber, String Email, String website, int FoodImage) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.contactNumber = contactNumber;
        this.Email = Email;
        this.website = website;
        this.FoodImage = FoodImage;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        price = price;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }


    public int getFoodImage() {
        return FoodImage;
    }

    public void setFoodImage(int foodImage) {
        FoodImage = foodImage;
    }
}
