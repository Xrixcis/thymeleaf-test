package com.github.xrixcis.thymeleaf.web;

import com.github.xrixcis.thymeleaf.core.model.User;
import com.github.xrixcis.thymeleaf.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by xrixcis on 4.1.17.
 */
@Controller
@RequestMapping("/user/")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String users(Model model) {
        model.addAttribute("users", service.getUsers());
        return "th/user/users_list";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "th/user/new_user";
    }

    @PostMapping("/new")
    public String newUser(@Valid User user, BindingResult binding) {
        if (binding.hasErrors()) {
            return "th/user/new_user";
        } else {
            service.addUser(user);
            return "redirect:/user/";
        }
    }
}
