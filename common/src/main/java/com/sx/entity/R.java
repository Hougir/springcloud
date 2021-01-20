package com.sx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/1/20 10:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuppressWarnings("all")
public class R implements Serializable {
    private long TaskID;        //18424321	返回本次任务的序列ID
    private String Message;        //ok	返回信息
    private String ReturnStatus;    //string	Success	成功返回Success 失败返回：Faild
    private long SuccessCounts;    //number	1	当成功后返回提交成功短信数
    private long RemainPoint;    //number	420842	返回余额


}
