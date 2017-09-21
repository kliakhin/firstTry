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

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.getById(id));
        return "showUser";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAll());
        return "userList";
    }

    @PostMapping("/newUser")
    public String createUser(@ModelAttribute User user) {
        userService.save(user);
        return "redirect:users";
    }

    @GetMapping("/edit/{id}")
    public String editPage(@PathVariable("id") int id, Model model) {
        System.out.println("id = " + id);
        model.addAttribute("user", userService.getById(id));
        return "editUser";
    }

    @PostMapping("/editUser")
    public String editUser(@ModelAttribute User user, Model model) {
        userService.update(user);
        return "redirect:edit/" + user.getId();
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userService.delete(id);
        return "redirect:/users";
    }

    @PostMapping("/delete")
    public String deleteUser2(@ModelAttribute("id") int id) {
        userService.delete(id);
        return "redirect:users";
    }
}
