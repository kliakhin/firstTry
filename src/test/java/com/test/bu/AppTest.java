package com.test.bu;

import com.test.bu.config.SpringConfig;
import com.test.bu.context.JpaConfigTest;
import com.test.bu.entity.User;
import com.test.bu.service.interfaces.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.NoResultException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class, JpaConfigTest.class})
public class AppTest {

    @Autowired
    private UserService userService;

    @Test
    public void createUser() {
        User user = createTestUser("name1");
        userService.save(user);
        ArrayList<User> all = (ArrayList<User>) userService.getAll();
        assertEquals(1, all.size());
        assertEquals("name1", all.get(0).getUsername());
    }

    @Test(expected = NoResultException.class)
    public void deleteUser() {
        User testUser = createTestUser("name2");
        userService.save(testUser);
        User user = userService.getByName("name2");
        assertNotNull(user);
        userService.delete(user.getId());
        userService.getByName("name2");
    }

    private User createTestUser(String userName) {
        User user = new User();
        user.setEmail("mail1");
        user.setAge(4);
        user.setEnabled(1);
        user.setPassword("234");
        user.setPhoneNumber("123");
        user.setUsername(userName);
        return user;
    }


}
