package com.sx.entity;

import lombok.Data;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/3/8 16:46
 */
@Data
public class IncomeInfo {
    private String payAmount; //实际支付金额
    private String platformCoupon; //平台券补贴金额，若订单发生退款，平台券补贴金额按占订单总额的比例扣除
}
