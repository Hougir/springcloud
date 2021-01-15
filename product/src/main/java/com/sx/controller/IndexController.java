package com.sx.controller;

import com.sx.commom.MQChannelSource;
import com.sx.entity.User;
import com.sx.service.MQService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/1/13 18:06
 */
@Slf4j
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private MQService mqService;


    @RequestMapping(value = "/proMsg",method = RequestMethod.GET)
    public Object proMsg(@RequestParam("msg") String msg){
        return mqService.productMsg(msg);
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public Object login(@RequestParam("name") String name,
                        @RequestParam("age") Integer age,
                        @RequestParam("sex") Integer sex){
        User user = new User(name,age,sex);
        return mqService.login(user);
    }
}
