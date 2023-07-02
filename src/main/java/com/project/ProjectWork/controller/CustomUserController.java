package com.project.ProjectWork.controller;


import com.project.ProjectWork.dto.RegistrationDto;
import com.project.ProjectWork.entity.CustomUser;
import com.project.ProjectWork.repository.CustomUserRepository;
import com.project.ProjectWork.service.CustomUserService;
import com.project.ProjectWork.service.CustomUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class CustomUserController {

    @Autowired
    private CustomUserService userService;

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/users")
    public String listCustomUser(Model model) {
        model.addAttribute("users", userService.getAllUser());
        return "user";
    }

    @GetMapping("/registration")
    public String registration(Model model) {
//        model.addAttribute("users", userService.getAllUser());
        return "registration";
    }
}
