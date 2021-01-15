package com.sx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心
 * @author huang hao
 * @version 1.0
 * @date 2021/1/15 10:01
 */
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class BaseConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseConfigApplication.class,args);
    }
}
