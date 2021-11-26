package com.spring.payment.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.payment.entity.Payment;
import com.spring.payment.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payNow")
    public Payment payNow(@RequestBody Payment payment) {
	return paymentService.saveOrUpdatePayment(payment);
    }

    @GetMapping("/{paymentId}")
    public Optional<Payment> getPaymentById(@PathVariable int paymentId) {
	return paymentService.getPaymentById(paymentId);
    }
    @GetMapping("/test")
    public String test() {
	//return restTemplate.getForObject("http://localhost:8901/order/welcome", String.class);
	return restTemplate.getForObject("http://order-service/order/welcome", String.class);
    }
}
