package com.sx.controller;

import com.alibaba.fastjson.JSONObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.sx.entity.OrderInfo;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/6/16 14:22
 */
@RestController
@RequestMapping("/mongoDB")
public class MongoDBController {

    @Autowired
    private MongoTemplate mongoTemplate;
    @RequestMapping("/save")
    public String saveMongoDB(){
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId("9875633");
        orderInfo.setCreateTime("2021-06-16 14:25:33");
        orderInfo.setProductId("6666");
        //OrderInfo save = mongoTemplate.insert(orderInfo);
        OrderInfo save = mongoTemplate.insert(orderInfo,"orderInfo");
        return JSONObject.toJSONString(save);
    }

    @RequestMapping("/get/{orderId}")
    public String getMongoDB(@PathVariable("orderId") String orderId){
        //123456
        Query query = Query.query(Criteria.where("orderId").is(orderId));
        //find() 返回所有满足条件的文档
        List<OrderInfo> orderInfoList = mongoTemplate.find(query, OrderInfo.class, "orderInfo");
        return JSONObject.toJSONString(orderInfoList);
    }
    @RequestMapping("/getAll")
    public String getAll(){
        //findAll() 返回集合中所有的文档
        List<OrderInfo> orderInfoList = mongoTemplate.findAll(OrderInfo.class, "orderInfo");
        return JSONObject.toJSONString(orderInfoList);
    }
}
