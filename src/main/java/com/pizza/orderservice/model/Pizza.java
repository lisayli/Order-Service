package com.pizza.orderservice.model;


public class Pizza {

    private String name;
    private String ingredient;
    private String price;


    public Pizza(String name, String ingredient, String price) {
        this.name = name;
        this.ingredient = ingredient;
        this.price = price;
    }

    public Pizza() {
    }


    public String getName() {
        return name;
    }

    public String getIngredient() {
        return ingredient;
    }

    public String getPrice() {
        return price;
    }

}
