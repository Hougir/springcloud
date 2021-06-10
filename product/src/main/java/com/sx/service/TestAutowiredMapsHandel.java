package com.sx.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * 测试@Autowired注入到集合  map
 * @author huang hao
 * @version 1.0
 * @date 2021/5/10 9:38
 */
@Slf4j
@Service
public class TestAutowiredMapsHandel {
    @Autowired
    Map<String,TestAutowiredMaps> maps;
    /*@Autowired
    List<TestAutowiredMaps> maps;*/
    public Object invoke(){
        //maps.entrySet().stream().forEach(m->m.getValue().doSome());
        //maps.stream().forEach(TestAutowiredMaps::doSome);
        for (TestAutowiredMaps t : maps.values()) {
            t.doSome();
        }
        return "success";
    }
}
