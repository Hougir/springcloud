package com.sx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 * @author huang hao
 * @version 1.0
 * @date 2021/1/15 9:40
 */
@EnableEurekaServer
@SpringBootApplication
public class BaseEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseEurekaApplication.class, args);
    }
}
