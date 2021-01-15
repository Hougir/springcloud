package com.sx.service;

import com.alibaba.fastjson.JSON;
import com.sx.commom.MQChannelSource;
import com.sx.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;
import javax.annotation.Resource;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/1/14 10:10
 */
@Slf4j
@Service
public class MQService {
    @Resource
    private MQChannelSource mqChannelSource;

    public Object productMsg(String msg){
        log.info("发送成功:"+msg);
        boolean send = mqChannelSource.tianRuiYunOutput().send(
                MessageBuilder.withPayload(msg)
                        .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build()
        );
        if (!send) return "fail!";
        return "success";
    }

    public Object login(User user) {
        log.info("发送成功:"+ user);
        boolean send = mqChannelSource.tianRuiYunOutput().send(
                MessageBuilder.withPayload(user)
                        .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build()
        );
        if (!send) return "fail!";
        return "success";
    }
}
