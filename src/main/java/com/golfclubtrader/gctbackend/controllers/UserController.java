package com.golfclubtrader.gctbackend.controllers;

import com.golfclubtrader.gctbackend.services.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping({"/users"})
    public String allUsers(Model model) {

        model.addAttribute("users", userService.findAll());

        return "users/index";
    }
}
