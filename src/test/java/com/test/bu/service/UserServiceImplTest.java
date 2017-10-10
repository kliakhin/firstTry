package com.test.bu.service;

import com.test.bu.config.JpaConfigTest;
import com.test.bu.config.SpringConfig;
import com.test.bu.config.WebAppConfig;
import com.test.bu.entity.User;
import com.test.bu.service.interfaces.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class, JpaConfigTest.class})
//@DataJpaTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void getById() throws Exception {
        User user = getTestUser("testuser123");
        userService.save(user);
        ArrayList<User> all = (ArrayList<User>) userService.getAll();
        Optional<User> testuser123 = all.stream().filter(u -> u.getUserName().equals("testuser123")).findFirst();
        User user1 = testuser123.get();
        User userServiceById = userService.getById(user1.getId());
        assertNotNull(userServiceById);
        assertEquals("testuser123", userServiceById.getUserName());
    }

    private User getTestUser(String name) {
        User user = new User();
        user.setUserName(name);
        user.setEmail("testmail@gmail.com");
        return user;
    }

    @Test
    public void getByName() throws Exception {
        User testuser1 = getTestUser("testuser");
        userService.save(testuser1);
        User testuser = userService.getByName("testuser");
        assertNotNull(testuser);
        assertEquals("testmail@gmail.com", testuser.getEmail());
    }

    @Test
    public void getAll() throws Exception {
        User user = new User();
        user.setUserName("user123333");
        userService.save(user);
        Collection<User> all = userService.getAll();
        assertEquals(1, all.size());
    }

    @Test
    public void save() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

}