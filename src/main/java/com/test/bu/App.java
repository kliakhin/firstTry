package com.test.bu;

import com.test.bu.config.SpringConfig;
import com.test.bu.dao.UserDao;
import com.test.bu.dao.UserDaoIml;
import com.test.bu.entity.User;
import com.test.bu.service.UserService;
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

        UserDao userDao = context.getBean(UserDaoIml.class);
        User user = new User();
        user.setName("new user 123");
        user.setEmail("some email 123");
        user.setAge(103);
        //userDao.save(user);
        List<User> allUsers = userDao.getAll();
        allUsers.forEach(System.out::println);

        User user1 = allUsers.get(1);
        User userById = userDao.getUserById(user1.getId());

        System.out.println("User by id = " + userById);


        userById.setName("Updated name");
        userDao.update(userById);

        System.out.println("Updated = " + userDao.getUserById(userById.getId()));


        UserService service = context.getBean(UserService.class);

        //userDao.delete(5);
        userDao.delete("Updated name");
    }
}
