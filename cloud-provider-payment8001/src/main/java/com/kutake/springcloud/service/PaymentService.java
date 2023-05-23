package com.kutake.springcloud.service;


import com.kutake.springcloud.entities.Payment;

public interface PaymentService {
    public int create(Payment payment); //写
    public Payment getPaymentById(Long id);  //读取
}
