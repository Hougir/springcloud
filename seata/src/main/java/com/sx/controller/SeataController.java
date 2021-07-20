package com.sx.controller;

import com.sx.service.TGoodsSevice;
import com.sx.util.R;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Api(description = "Seata分布式事务测试")
@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RefreshScope
@RequestMapping("/seata")
public class SeataController {
    @Autowired
    TGoodsSevice sevice;
    @RequestMapping("/buy")
    public R buy(){
        log.info("buy is");
        return sevice.buy();
    }
}