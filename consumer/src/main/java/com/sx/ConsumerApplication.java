package com.sx;

import com.sx.commom.MQChannelSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;


/**
 * @author huang hao
 * @version 1.0
 * @date 2021/1/14 9:54
 */
//@EnableScheduling //开启定时任务
@SpringBootApplication
@EnableBinding(MQChannelSource.class)
@EnableDiscoveryClient
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }


}
