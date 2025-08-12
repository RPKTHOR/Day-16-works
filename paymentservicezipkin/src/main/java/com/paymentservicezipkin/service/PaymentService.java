package com.paymentservicezipkin.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String processPayment() {
        System.out.println("Payment Service: Starting payment process");

        // Simulate payment delay
        try {
            Thread.sleep(120); // Simulate 120ms delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return "Payment failed due to interruption";
        }

        System.out.println("Payment Service: Payment completed");
        return "Payment successful";
    }
}
