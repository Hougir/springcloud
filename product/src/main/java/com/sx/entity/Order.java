package com.sx.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/3/8 16:40
 */
@Data
@ToString
public class Order {
    private OrderInfo orderInfo;
    private SettleInfo settleInfo;
    private IncomeInfo incomeInfo;
    private OutcomeInfo outcomeInfo;
}
