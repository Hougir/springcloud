package com.sx.entity;

import lombok.Data;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/3/8 16:42
 */
@Data
public class OrderInfo {

    private String orderId; //子订单ID
    private String createTime;//订单创建时间
    private String productId;//商品ID


}
