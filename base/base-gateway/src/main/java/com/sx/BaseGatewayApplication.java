package com.sx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/1/15 15:17
 */
@EnableEurekaClient
//@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class BaseGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseGatewayApplication.class, args);
    }
}
