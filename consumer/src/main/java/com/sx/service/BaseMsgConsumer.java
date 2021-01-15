package com.sx.service;

import com.sx.commom.QueueMsg;
import org.slf4j.Logger;
import org.springframework.messaging.MessageChannel;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/1/14 11:54
 */
public abstract class BaseMsgConsumer<Q extends QueueMsg> {

    static final String SEND_RESULT_KEY = "__SEND_RESULT__";
    static final String QUERY_RESULT_KEY = "__QUERY_RESULT__";

    static final String SEND_RES_PRIMARY_KEY = "__RES_CODE__";
    static final String SEND_SUCC_SIGN_KEY = "__SUCCESS_SIGN__";

    public Class<Q> getQClass(){
        Class<Q> tClass = (Class<Q>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return tClass;
    }

    /**
     * 渠道日志标识
     * @return
     */
    protected abstract String getLogText();

    /**
     * 获取日志输出对象
     * @return
     */
    protected abstract Logger getLog();



    /**
     * 消息队列生产者
     * @return
     */
    protected abstract MessageChannel getMsgWriter();

    /**
     * 是否重复发送
     * @return
     */
    protected boolean retry(Map<String, String> sendResult){
        return true;
    }

    /**
     * 保存成功信息
     * @param queueMsg 消息
     * @param result 发送结果
     */
    protected abstract void saveSuccResult(Q queueMsg, Map<String, String> result);

    /**
     * 保存失败及异常问题
     * @param queueMsg 消息
     */
    protected abstract void saveErrorResult(Q queueMsg);

    /**
     * 发送短信
     * @param queueMsg 消息
     *        mobile手机号码
     *        context 短信内容/模板参数（使用模板时，各个参数使用“##”分隔放在该参数里）
     *        sign 签名
     *        templateNo 模板号，不使用模板传空
     * @param account 账户名
     * @param token token
     * @param extParamMap 扩展参数（账户信息中的扩展参数）
     *
     * @return 结果MAP中必须包含KEY：“com.xcom.core.sms.consumer.BaseMsgConsumer#SEND_RESULT_KEY”，发送成功时值存“SUCCESS”
     */
    protected abstract Map<String, String> sendMsg(Q queueMsg, String account, String token, Map<String, Object> extParamMap);

    /**
     * 短信发送结果查询校验
     *
     * @TODO 各平台暂时默认不处理结果查询，需要结果查询的重写该方法即可，这里为后期扩展留切点
     *
     * @param queueMsg 消息
     * @param sendResult 消息发送方法返回结果
     *
     * @return 结果MAP中必须包含KEY：“com.xcom.core.sms.consumer.BaseMsgConsumer#QUERY_RESULT_KEY”，查询结果为成功时值存“SUCCESS”
     */
    protected Map<String, String> querySendStatus(Q queueMsg, Map<String, String> sendResult){
        Map<String, String> queryResult = new HashMap<>();
        queryResult.put(QUERY_RESULT_KEY, "SUCCESS");
        return queryResult;
    }


    public static final String CFG_KEY_STRING_succWithoutSend = "succWithoutSend";

    public void receiveTransactionalMsg(String transactionMsg) {
        getLog().info("{} receive msg: {}", getLogText(), transactionMsg);
    }
}
