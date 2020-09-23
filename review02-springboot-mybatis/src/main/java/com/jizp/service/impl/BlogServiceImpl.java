package com.jizp.service.impl;

import com.jizp.entity.Blog;
import com.jizp.mapper.BlogXmlMapper;
import com.jizp.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: jizongpeng
 * @Date: 2020/9/17 16:48
 * @Version: 1.0
 * @Description:
 */
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogXmlMapper blogXmlMapper;

    @Override
    public Blog findBlog(int id) {
        return blogXmlMapper.findBlogById(id);
    }
}
