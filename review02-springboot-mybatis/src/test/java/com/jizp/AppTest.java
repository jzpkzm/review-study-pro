package com.jizp;

import com.jizp.entity.Blog;
import com.jizp.entity.User;
import com.jizp.service.BlogService;
import com.jizp.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: jizongpeng
 * @Date: 2020/9/9 19:31
 * @Version: 1.0
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
    @Autowired
    private UserService userService;

    @Test
    public void findAll() {
        List<User> list =  userService.xmlFindAll();
        System.out.println(list);
    }

    @Test
    public void findUserById() {
        User user = userService.findUserById(3);
        System.out.println(user);
    }

    @Test
    public void annotationFindAll() {
        List<User> list =  userService.annotationFindAll();
        System.out.println(list);
    }

    @Test
    public void addUserTypeHandler() {
        User user = new User();
        user.setId(4);
        user.setName("typeHandler2");
        user.setRegTime(new Date());

        System.out.println(userService.addUser(user));
    }

    @Autowired
    private BlogService blogService;

    @Test
    public void findBlogById() {
        Blog blog = blogService.findBlog(1);
        System.out.println(blog);
    }
}
