package com.sx.service;

import com.sx.ProductApplication;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/3/18 13:59
 */

// 让 JUnit 运行 Spring 的测试环境， 获得 Spring 环境的上下文的支持
@RunWith(SpringRunner.class)
// 获取启动类，加载配置，确定装载 Spring 程序的装载方法，它回去寻找 主配置启动类（被 @SpringBootApplication 注解的）
@SpringBootTest(classes = {ProductApplication.class})
class MQServiceTest {
    @Autowired
    MQService mqService;
    //@BeforeEach：初始化方法，执行当前测试类的每个测试方法前执行。
    @BeforeEach
    void setUp() {
        System.out.println("setUp");
    }

    //@AfterEach释放资源，执行当前测试类的每个测试方法后执行
    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    @Test
    void test() {
        Object o = mqService.productMsg("666");
        System.out.println("test="+o);
    }
}
