package com.qhh.cloud.service.impl;

import com.qhh.cloud.dao.PaymentDao;
import com.qhh.cloud.entities.Payment;
import com.qhh.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：qhh
 * @date ：Created in 2021/12/17 17:04
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
