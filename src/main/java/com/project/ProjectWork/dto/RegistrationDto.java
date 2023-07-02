package com.project.ProjectWork.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
public class RegistrationDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
