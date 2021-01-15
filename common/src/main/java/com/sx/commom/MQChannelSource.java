package com.sx.commom;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/1/14 9:49
 */
public interface MQChannelSource {
    //生产者通道
    @Output(MQCnst.CUSTOMIZE_OUTPUT)
    MessageChannel tianRuiYunOutput();

    //消费者通道
    @Input(MQCnst.CUSTOMIZE_INPUT)
    SubscribableChannel tianRuiYunInput();
}
