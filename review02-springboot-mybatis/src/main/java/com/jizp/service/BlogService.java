package com.jizp.service;

import com.jizp.entity.Blog;

public interface BlogService {
    Blog findBlog(int id);

    Blog findBlogAuthorById(int i);

    Blog findBlogPostById(int i);
}
