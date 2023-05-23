package com.kutake.springcloud.service.impl;


import com.kutake.springcloud.entities.Payment;
import com.kutake.springcloud.mapper.PaymentMapper;
import com.kutake.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    //@Autowired
    private PaymentMapper paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
