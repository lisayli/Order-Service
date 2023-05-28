package com.pizza.orderservice.model;

public class PizzaOrderModel {

    private Long id;

    private String name;
    private String ingredient;
    private String price;



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
