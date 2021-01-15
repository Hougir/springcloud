package com.sx.service;

import com.alibaba.fastjson.JSON;
import com.sx.commom.MQChannelSource;
import com.sx.commom.MQCnst;
import com.sx.commom.QueueMsg;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/1/14 10:16
 */
@Slf4j
@Service
public class ConsumerService extends BaseMsgConsumer<QueueMsg> {

    @Autowired
    private MQChannelSource mqChannelSource;

    @StreamListener(MQCnst.CUSTOMIZE_INPUT)
    public void receiveTransactionalMsg(String transactionMsg) {
        log.info("收到消息=========> {}", JSON.toJSONString(transactionMsg));
    }
    @Override
    protected String getLogText() {
        return "MQ > ";
    }

    @Override
    protected Logger getLog() {
        return log;
    }

    @Override
    protected MessageChannel getMsgWriter() {
        return mqChannelSource.tianRuiYunOutput();
    }

    @Override
    protected void saveSuccResult(QueueMsg queueMsg, Map result) {

    }

    @Override
    protected void saveErrorResult(QueueMsg queueMsg) {

    }

    @Override
    protected Map<String, String> sendMsg(QueueMsg queueMsg, String account, String token, Map extParamMap) {
        return null;
    }


}
