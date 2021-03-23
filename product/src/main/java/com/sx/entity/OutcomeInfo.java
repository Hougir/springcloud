package com.sx.entity;

import lombok.Data;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/3/8 16:49
 */
@Data
public class OutcomeInfo {
    private String refundAmount; //订单退款金额
    private String platformServiceFee; //平台服务费，订单实付金额*平台服务费率
    private String authorCommission; //达人佣金，计费公式：实收货款*达人佣金，计费基数不含平台券和运费
    private String goodLearn_ChannelFee; //商品渠道费用，计费公式：(订单实付-平台服务费-达人佣金)*渠道分成比例
}
