package com.kutake.springcloud.controller;

import com.kutake.springcloud.entities.CommonResult;
import com.kutake.springcloud.entities.Payment;
import com.kutake.springcloud.feign.PaymentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderFeignController {
    @Autowired
    private PaymentServer paymentServer;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentServer.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return paymentServer.paymentFeignTimeout();
    }

}


