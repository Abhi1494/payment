package com.spring.payment.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.payment.entity.Payment;
import com.spring.payment.repository.PaymentRepository;

@Service
public class PaymentService {

@Autowired
private PaymentRepository paymentRepository;

public Payment saveOrUpdatePayment(Payment payment) {
    payment.setTransactionId(UUID.randomUUID().toString());
    return paymentRepository.save(payment);
}

public Optional<Payment> getPaymentById(int id) {
    return paymentRepository.findById(id);
}
}
