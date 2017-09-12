package com.test.bu;

import com.test.bu.config.SpringConfig;
import com.test.bu.dao.UserDaoIml;
import com.test.bu.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserDaoIml userDaoIml = context.getBean(UserDaoIml.class);
        User user = new User();
        user.setName("new user 123");
        user.setEmail("some email 123");
        user.setAge(103);
        userDaoIml.save(user);

        List<User> allUsers = userDaoIml.getAll();

        allUsers.forEach(System.out::println);
    }
}
