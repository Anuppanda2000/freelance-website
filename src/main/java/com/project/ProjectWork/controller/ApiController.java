package com.project.ProjectWork.controller;

import com.project.ProjectWork.dto.RegistrationDto;
import com.project.ProjectWork.entity.CustomUser;
import com.project.ProjectWork.service.CustomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApiController {
    @Autowired
    private CustomUserService userService;


    @PostMapping("/process_register")
    public String processRegister(RegistrationDto registrationDto) {
        System.out.println("registrationDto: "+registrationDto);
        CustomUser customUser = new CustomUser();
        customUser.setFirstName(registrationDto.getFirstName());
        customUser.setLastName(registrationDto.getLastName());
        customUser.setEmail(registrationDto.getEmail());
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(registrationDto.getPassword());
        customUser.setPassword(encodedPassword);
        userService.save(customUser);
        return "register_success";
    }
}
