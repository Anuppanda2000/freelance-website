package com.project.ProjectWork.service;

import com.project.ProjectWork.entity.CustomUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.ProjectWork.repository.CustomUserRepository;

import java.util.List;

@Service
public class CustomUserServiceImpl implements CustomUserService {

    @Autowired
    private CustomUserRepository customUserRepository;

    public CustomUserServiceImpl(CustomUserRepository customUserRepository) {
        this.customUserRepository = customUserRepository;
    }


    @Override
    public List<CustomUser> getAllUser() {
        return customUserRepository.findAll();
    }

    @Override
    public CustomUser save(CustomUser customUser) {
       return customUserRepository.save(customUser);
    }
}
