package com.pizza.orderservice.service;

import com.pizza.orderservice.config.MessagingConfig;
import com.pizza.orderservice.model.Pizza;
import com.pizza.orderservice.model.UserRequest;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public MessageListener(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void listenerPizza(Pizza message) {
        System.out.println(message.getName() + " | " + message.getIngredient() + " | " + message.getPrice());
    }

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void listenerUser(UserRequest message) {
        System.out.println(message);
        System.out.println(message.getFirstName() + " | " + message.getLastName() + " | " + message.getEmail());
    }
}

