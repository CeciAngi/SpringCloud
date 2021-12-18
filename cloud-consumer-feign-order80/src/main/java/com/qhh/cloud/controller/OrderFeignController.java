package com.qhh.cloud.controller;

import com.qhh.cloud.entities.CommonResult;
import com.qhh.cloud.entities.Payment;
import com.qhh.cloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：qhh
 * @date ：Created in 2021/12/18 19:11
 */

@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        CommonResult<Payment> payment = paymentFeignService.getPaymentById(id);
        return payment;
    }
}
