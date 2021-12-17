package com.qhh.cloud.controller;

import com.qhh.cloud.entities.CommonResult;
import com.qhh.cloud.entities.Payment;
import com.qhh.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ：qhh
 * @date ：Created in 2021/12/17 17:07
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("********插入结果：" + result);
        if (result > 0)
            return new  CommonResult(200, "插入数据库成功, serverPort: " + serverPort, result);
        return new  CommonResult(444, "插入数据库失败");
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果：" + payment);
        if (payment != null) {
            return new CommonResult(200,"查询成功, serverPort: " + serverPort, payment);
        }
        return new CommonResult<>(444, "无记录");
    }
}
