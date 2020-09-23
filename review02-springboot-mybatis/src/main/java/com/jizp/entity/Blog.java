package com.jizp.entity;

import lombok.Data;

import java.util.List;

/**
 * @Author: jizongpeng
 * @Date: 2020/9/17 16:46
 * @Version: 1.0
 * @Description:
 */
@Data
public class Blog {
    private int id;
    private String title;
    private Author author;
    private List<Post> posts;
}
