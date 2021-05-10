package com.sx.controller;

import com.sx.entity.User;
import com.sx.service.MQService;
import com.sx.service.TestAutowiredMaps;
import com.sx.service.TestAutowiredMapsHandel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    TestAutowiredMapsHandel testAutowiredMapsHandel;


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

    @RequestMapping(value = "/send",method = RequestMethod.GET)
    public Object login(@RequestParam("phone") String phone){
        log.info("发送短信。号码===> {}",phone);
        return mqService.send(phone);
    }

    @RequestMapping(value = "/async",method = RequestMethod.GET)
    public Object async(){
        log.info("async===>");
        return mqService.async();
    }

    /**
     * 测试@Autowired注入到集合  map
     * @return
     */
    @RequestMapping(value = "/test/autowired/maps",method = RequestMethod.GET)
    public Object maps(){
        log.info("【/test/autowired/maps】");
        return testAutowiredMapsHandel.invoke();
    }
}
