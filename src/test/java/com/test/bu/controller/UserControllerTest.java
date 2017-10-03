package com.test.bu.controller;

import com.test.bu.config.JpaConfigTest;
import com.test.bu.config.SpringConfig;
import com.test.bu.config.WebAppConfig;
import com.test.bu.entity.User;
import com.test.bu.service.interfaces.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class, JpaConfigTest.class, WebAppConfig.class})
@WebAppConfiguration
public class UserControllerTest {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(context)
                .build();
    }

    @Autowired
    private UserService userService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getById() throws Exception {
        User user = new User();
        user.setUserName("userFromControl");
        user.setEmail("email");
        user.setPhoneNumber("123");
        user.setEnabled(1);
        user.setAge(4);
        userService.save(user);
        //doReturn(user).when(userService.getById(anyInt()));
        //when(userService.getById(anyInt())).thenReturn(user);

        mockMvc.perform(get("/user/{id}", 1))
                .andExpect(status().isOk())
                .andExpect(view().name("showUser"))
                .andExpect(model().attributeExists("user"));

        mockMvc.perform(get("/user/{id}", 1).param("edit", String.valueOf(true)))
                .andExpect(status().isOk())
                .andExpect(view().name("editUser"))
                .andExpect(model().attributeExists("user"));
        //verify(userService, times(1)).getById(1);
    }

    @Test
    public void getAll() throws Exception {
    }

    @Test
    public void createPage() throws Exception {
    }

    @Test
    public void createUser() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void deleteUser() throws Exception {
    }

}