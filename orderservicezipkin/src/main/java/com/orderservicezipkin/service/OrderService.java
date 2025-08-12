package com.orderservicezipkin.service;

import java.util.Map;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    private final RestTemplate restTemplate;

    public OrderService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public String processOrder(Map<String, String> orderDetails) {
        // Log start of order processing
        System.out.println("Order Service: Starting order process");

        // Call Payment Service
        String paymentResponse = restTemplate.postForObject(
            "http://localhost:8081/payments", orderDetails, String.class);

        // Log completion
        System.out.println("Order Service: Order processed");

        return "Order confirmed. Payment status: " + paymentResponse;
    }
}
