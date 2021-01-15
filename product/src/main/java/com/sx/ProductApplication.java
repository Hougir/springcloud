package com.sx;

import com.sx.commom.MQChannelSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;


/**
 * @author huang hao
 * @version 1.0
 * @date 2021/1/13 17:34
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding(MQChannelSource.class)
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
    }
}
