package com.sx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/1/14 17:41
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private String name;
    private Integer age;
    private Integer sex;
}
