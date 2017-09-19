package com.test.bu.controller;


import com.test.bu.entity.User;
import com.test.bu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("user", userById);
        return "user";
    }

    @GetMapping("/users")
    public String showAllUsers(Model model) {
        model.addAttribute("users", userService.getAll());
        return "userList";
    }

    @GetMapping("/user")
    public String addUser(@RequestParam("name") String name, @RequestParam("email") String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userService.save(user);
        return "redirect:users";
    }

    @PostMapping("/newUser")
    public String newUser(@ModelAttribute User user) {
        userService.save(user);
        return "redirect:users";
    }
}
