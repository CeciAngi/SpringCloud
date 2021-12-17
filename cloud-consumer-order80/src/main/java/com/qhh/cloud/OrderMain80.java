package com.qhh.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：qhh
 * @date ：Created in 2021/12/17 18:00
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
    public static void main( String[] args ){
        SpringApplication.run(OrderMain80.class, args);
    }
}
