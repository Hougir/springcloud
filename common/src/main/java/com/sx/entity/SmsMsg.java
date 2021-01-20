package com.sx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/1/20 9:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SmsMsg implements Serializable {
    private String appkey;
    private String mobile;

    private String content;
}
