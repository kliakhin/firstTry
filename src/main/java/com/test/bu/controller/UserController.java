package com.test.bu.controller;


import com.test.bu.entity.User;
import com.test.bu.service.interfaces.UserService;
import com.test.bu.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.soap.Node;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") int id,
                          @RequestParam(value = "edit", required = false) boolean edit, Model model) {
        model.addAttribute("user", userService.getById(id));
        if (edit) {
            return "editUser";
        }
        return "showUser";
    }

    @GetMapping("/all")
    public String getAll(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        //Principal principal = (Principal) authentication.getPrincipal();
       // System.out.println(principal.getName());
        model.addAttribute("users", userService.getAll());
        return "userList";
    }


    @GetMapping("/create")
    public String createPage(@RequestParam(value = "message", required = false) String message,
                             Model model) {
        if (message != null) {
            model.addAttribute("message", message);
        }
        return "createUserForm";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute User user, Model model) {
        List<String> errors = Utils.validate(user);
        if (!errors.isEmpty()) {
            model.addAttribute("errors", errors);
            return "createUserForm";
        }
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
