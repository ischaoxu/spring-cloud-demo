package com.kutake.springcloud;

import com.kutake.ruleconfig.MyIrule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MyIrule.class)
public class ConsumerApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication80.class, args);
    }
}