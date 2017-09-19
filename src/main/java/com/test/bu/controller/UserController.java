package com.test.bu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class UserController {

    @RequestMapping(value = "/helloUser", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

}
