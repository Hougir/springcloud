package com.sx.commom;

import lombok.Getter;
import lombok.Setter;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/1/14 11:55
 */
@Setter
@Getter
public abstract class QueueMsg {

    private String mobile;

    private String context;

    private Long accountId;

    private String serviceCode;

    private String extParam;

    private Long count;

    abstract QueueMsg copyWithNewMobile(String mobile);
}
