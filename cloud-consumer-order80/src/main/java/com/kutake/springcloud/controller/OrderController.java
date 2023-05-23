package com.kutake.springcloud.controller;

import com.kutake.springcloud.entities.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getUserById(@PathVariable("id") Long id) {
        return restTemplate.getForObject("http://CLOUD-PAYMENT-SERVICE/payment/get/" + id, CommonResult.class);
    }
}
