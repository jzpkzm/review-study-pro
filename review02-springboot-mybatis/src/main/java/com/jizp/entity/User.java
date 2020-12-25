package com.jizp.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: jizongpeng
 * @Date: 2020/9/9 19:15
 * @Version: 1.0
 * @Description:
 */
@Data
public class User {
    private int id;
    private String name;
    private Date regTime;
    private int sex;
}
