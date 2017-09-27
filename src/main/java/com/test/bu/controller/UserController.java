package com.test.bu.controller;


import com.test.bu.entity.User;
import com.test.bu.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") int id, @RequestParam(value = "edit", required = false) boolean edit, Model model) {
        model.addAttribute("user", userService.getById(id));
        if (edit) {
            return "editUser";
        } else {
            return "showUser";
        }
    }

    @GetMapping("/all")
    public String getAll(Model model) {
        model.addAttribute("users", userService.getAll());
        return "userList";
    }

    @GetMapping("/create")
    public String createPage() {
        return "createUserForm";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute User user) {
        userService.save(user);
        return "redirect:all";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute User user) {
        userService.update(user);
        return "redirect:" + user.getId() + "?edit=false";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userService.delete(id);
        return "redirect:/all";
    }
}
