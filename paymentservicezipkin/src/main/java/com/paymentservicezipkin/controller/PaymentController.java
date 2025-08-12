package com.paymentservicezipkin.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @PostMapping
    public ResponseEntity<String> processPayment(@RequestBody Map<String, String> paymentDetails) {
        System.out.println("Payment Service: Processing payment");
        // Simulate delay
        try { Thread.sleep(120); } catch (InterruptedException e) {}
        System.out.println("Payment Service: Payment completed");
        return ResponseEntity.ok("Payment successful");
    }
}
