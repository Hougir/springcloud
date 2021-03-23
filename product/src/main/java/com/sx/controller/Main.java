package com.sx.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.netflix.hystrix.contrib.javanica.utils.CommonUtils;
import com.sx.commom.HttpClientUtils;
import com.sx.entity.Order;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.util.CollectionUtils;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 抖音MD5签名算法
 */
public class Main {
    public static final String APP_KEY = "6839996111118329223";
    public static final String METHOD = "order.settle";
    public static final String PARAM_JSON = "{\"time_type\":\"1\",\"start_time\":\"2021-03-05 16:06:59\",\"end_time\":\"2021-03-07 16:06:59\"}";
    public static final String ACCESS_TOKEN = "edae7c30-8386-443b-88a1-031111596fdd";
    public static final String TIMESTAMP = "2021-03-08 14:13:59";
    public static final String SECRET = "749698a6-fcb3-4358-b241-ec1d93cf9c1f";

    /**
     * 查询订单账单明细
     * @return
     */
    public static Object orderSettle (){

        try {
            //拼接签名字符串
            String plainText = SECRET
                    + APP_KEY
                    + METHOD
                    + PARAM_JSON
                    + TIMESTAMP
                    + "v2"
                    + SECRET;
            //调用签名方法
            String res = stringToMD5(plainText);

            String url = "http://openapi-fxg.jinritemai.com/sku/detail" +
                    "?app_key=%s" +
                    "&method=%s" +
                    "&access_token=%s" +
                    "&param_json=%s" +
                    "&timestamp=%s" +
                    "&v=%s" +
                    "&sign=%s";
            //拼接三个参数 ：id  秘钥 和 code值
            String orderUrl = String.format(
                    url,
                    APP_KEY,
                    METHOD,
                    ACCESS_TOKEN,
                    PARAM_JSON,
                    TIMESTAMP,
                    "2",
                    res
            );
            //发送请求
            //String orderInfo = HttpClientUtils.get(orderUrl);
            String orderInfo = "{\n" +
                    "    \"data\":[\n" +
                    "        {\n" +
                    "            \"order_info\":{\n" +
                    "                \"order_id\":\"4707186553290011111\", //子订单ID\n" +
                    "                \"create_time\":\"2020-08-21 12:23:21\", //订单创建时间\n" +
                    "                \"product_id\":\"3435006789295412728\" //商品ID\n" +
                    "            },\n" +
                    "            \"settle_info\":{\n" +
                    "                \"settle_time\":\"2020-08-21 15:23:21\", //结算时间\n" +
                    "                \"pay_type\":\"1\", // 结算账户类型\n" +
                    "                \"flow_type\":\"1\", //业务类型\n" +
                    "                \"settle_amount\":97 //实际结算金额\n" +
                    "            },\n" +
                    "            \"income_info\":{\n" +
                    "                \"pay_amount\":102, //实际支付金额\n" +
                    "                \"platform_coupon\":0 //平台券补贴金额，若订单发生退款，平台券补贴金额按占订单总额的比例扣除\n" +
                    "            },\n" +
                    "            \"outcome_info\":{\n" +
                    "                \"refund_amount\":0, //订单退款金额\n" +
                    "                \"platform_service_fee\":5, //平台服务费，订单实付金额*平台服务费率\n" +
                    "                \"author_commission\":0, //达人佣金，计费公式：实收货款*达人佣金，计费基数不含平台券和运费\n" +
                    "                \"good_learn_channel_fee\":0 //商品渠道费用，计费公式：(订单实付-平台服务费-达人佣金)*渠道分成比例\n" +
                    "            }\n" +
                    "        },\n" +
                    "\t{\n" +
                    "            \"order_info\":{\n" +
                    "                \"order_id\":\"88888\", //子订单ID\n" +
                    "                \"create_time\":\"2020-08-21 12:23:21\", //订单创建时间\n" +
                    "                \"product_id\":\"3435006789295412728\" //商品ID\n" +
                    "            },\n" +
                    "            \"settle_info\":{\n" +
                    "                \"settle_time\":\"2020-08-21 15:23:21\", //结算时间\n" +
                    "                \"pay_type\":\"1\", // 结算账户类型\n" +
                    "                \"flow_type\":\"1\", //业务类型\n" +
                    "                \"settle_amount\":97 //实际结算金额\n" +
                    "            },\n" +
                    "            \"income_info\":{\n" +
                    "                \"pay_amount\":102, //实际支付金额\n" +
                    "                \"platform_coupon\":0 //平台券补贴金额，若订单发生退款，平台券补贴金额按占订单总额的比例扣除\n" +
                    "            },\n" +
                    "            \"outcome_info\":{\n" +
                    "                \"refund_amount\":0, //订单退款金额\n" +
                    "                \"platform_service_fee\":5, //平台服务费，订单实付金额*平台服务费率\n" +
                    "                \"author_commission\":0, //达人佣金，计费公式：实收货款*达人佣金，计费基数不含平台券和运费\n" +
                    "                \"good_learn_channel_fee\":0 //商品渠道费用，计费公式：(订单实付-平台服务费-达人佣金)*渠道分成比例\n" +
                    "            }\n" +
                    "        }\n" +
                    "    ],\n" +
                    "    \"err_no\":0,\n" +
                    "    \"message\":\"success\"\n" +
                    "}";
            JSONObject jsonObject = JSONObject.parseObject(orderInfo);
            if (!jsonObject.getString("message").equalsIgnoreCase("success")) return null;
            JSONArray jsonArray = jsonObject.getJSONArray("data");
            List<Order> orders = jsonArray.toJavaList(Order.class);
            if (CollectionUtils.isEmpty(orders))return null;
            Order order = null;
            /*if (orders.size() == 1){
                order = orders.get(0);
            }else {
                order = orders.get(1);
            }
            return order;*/
            return orders;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static String stringToMD5(String plainText) {
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(
                    plainText.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有这个md5算法！");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        StringBuilder md5code = new StringBuilder(new BigInteger(1, secretBytes).toString(16));
        while (md5code.length() < 32) {
            md5code.insert(0, "0");
        }
        return md5code.toString();
    }

    public static void main(String[] args) {
        /*Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String format1 = DateFormatUtils.format(date, "yyyy-MM-dd HH:mm:ss");
        System.out.println(format1);

        calendar.add(Calendar.MONTH, 1);
        Date newDate = calendar.getTime();
        String format = DateFormatUtils.format(newDate, "yyyy-MM-dd HH:mm:ss");*/
        BigDecimal totalAmount = new BigDecimal(0);
        totalAmount = totalAmount.add(new BigDecimal("5000"));
        System.out.println(totalAmount);


        //System.out.println(orderSettle());
    }
    /*public static void main(String []args){
        String secret = "749698a6-fcb3-4358-b241-ec1d93cf9c1f";
        String str = secret+"app_key6844048284663924231"+"methodproduct.list"+
                "param_json{\"page\":\"0\",\"size\":\"20\"}"+"timestamp2020-07-05 22:33:59"+"v2"+secret;
        String res = stringToMD5(str);
        System.out.println(res);
    }*/
}
