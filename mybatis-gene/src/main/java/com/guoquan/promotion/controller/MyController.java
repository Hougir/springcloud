package com.guoquan.promotion.controller;

import com.guoquan.promotion.service.SingleActivityOrderGoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/4/30 15:24
 */
@Slf4j
@RestController
@RequestMapping("my/controller")
public class MyController {
    @RequestMapping("t1/{condition}")
    public Object t1(@PathVariable(value = "condition")String condition){
        log.info("condition={}",condition);
        return "success";
    }
}
