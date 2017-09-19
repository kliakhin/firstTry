package com.test.bu.controller;


import com.test.bu.entity.User;
import com.test.bu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/helloUser", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable("id") int id, Model model) {
        User userById = userService.getById(id);
        model.addAttribute("userName", userById.getName());
        return "user";
    }
}
