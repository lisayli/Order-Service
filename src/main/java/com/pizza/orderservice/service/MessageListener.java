package com.pizza.orderservice.service;


import com.pizza.orderservice.config.MessagingConfig;
import com.pizza.orderservice.model.PizzaOrderModel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MessageListener {

    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public MessageListener(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void listener(PizzaOrderModel message) {
        System.out.println(message.getName() + " | " + message.getIngredient() + " | " + message.getPrice());
    }
}

