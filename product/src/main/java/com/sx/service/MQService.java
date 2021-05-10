package com.sx.service;

//import com.codingapi.tx.annotation.TxTransaction;
import com.sx.commom.MQChannelSource;
import com.sx.entity.SmsMsg;
import com.sx.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    @Autowired
    @Qualifier("MQServiceExecutor")
    private ThreadPoolTaskExecutor executor;



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

    //@TxTransaction(isStart = true)
    @Transactional
    public Object send(String phone) {
        log.info("发送成功:"+ phone);
        SmsMsg smsMsg = new SmsMsg();
        smsMsg.setAppkey("9a532ec53400bbf9edb52c2cadbd4345");
        smsMsg.setMobile(phone);
        smsMsg.setContent("【老婆】你的支付宝到账：88888888.88元，一辈子有效！");
        boolean send = mqChannelSource.tianRuiYunOutput().send(
                MessageBuilder.withPayload(smsMsg)
                        .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build()
        );
        if (!send) return "fail!";
        return "success";
    }

    @Async
    public Object async() {
        executor.submit(()->{
            log.info("t1异步执行开始: {}",Thread.currentThread().getName());
            wait();
            notify();
            log.info("t1异步执行结束: {}",Thread.currentThread().getName());
            return "success";
        });
        executor.submit(()->{
            log.info("t2异步执行开始: {}",Thread.currentThread().getName());
            int i = 1 / 0;
            log.info("t2异步执行结束: {}",Thread.currentThread().getName());
            return "success";
        });

        executor.submit(()->{
            log.info("t3=> {}:异步执行开始",Thread.currentThread().getName());
            wait();
            log.info("t3异步执行结束: {}",Thread.currentThread().getName());
            return "success";
        });
        return "success";
    }

    public Object autowiredMaps() {
        return null;
    }
}
