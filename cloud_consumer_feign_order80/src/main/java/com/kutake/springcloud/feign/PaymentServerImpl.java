package com.kutake.springcloud.feign;

import com.kutake.springcloud.entities.CommonResult;
import com.kutake.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

@Component
public class PaymentServerImpl implements PaymentServer{
    @Override
    public CommonResult<Payment> getPaymentById(Long id) {
        return null;
    }

    @Override
    public String paymentFeignTimeout() {
        return "null";
    }
}
