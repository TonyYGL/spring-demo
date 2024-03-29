package com.example.demo.dto;

import lombok.Data;

@Data
public class UserDto {
    private String userName;
    private String password;
    private String email;
    private int roleId = 1;
}
