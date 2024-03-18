package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.vo.ResponseUtil;
import com.example.demo.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public ResponseVo<List<User>> findAll() {
        return userService.findAll();
    }

    @PostMapping
    public ResponseVo<User> addUser(@RequestBody UserDto userDto) {
        return userService.addUser(userDto);
    }

}
