package com.qhh.cloud.service;

import com.qhh.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：qhh
 * @date ：Created in 2021/12/17 17:04
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
