package com.example.cwresturant;

public class Food {
    private String name;
    private String description;
    private int Price;
    private String contactNumber;
    private String Email;
    private String website;

    public Food(String name, String description,int price, String contactNumber, String email, String website) {
        this.name = name;
        this.description = description;
        Price = price;
        this.contactNumber = contactNumber;
        Email = email;
        this.website = website;
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
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
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
}
