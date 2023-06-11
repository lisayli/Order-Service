package com.pizza.orderservice.controller;

import com.pizza.orderservice.service.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaOrderController {


    private final MessageListener getOrderInformation;

    @Autowired
    public PizzaOrderController(MessageListener getOrderInformation) {
        this.getOrderInformation = getOrderInformation;
    }


}
