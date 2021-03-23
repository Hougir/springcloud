package com.sx.entity;

import lombok.Data;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/3/8 16:45
 */
@Data
public class SettleInfo {
    private String settleTime; //结算时间
    private String payType; // 结算账户类型
    private String flowType; //业务类型
}
