package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.vo.ResponseUtil;
import com.example.demo.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public ResponseVo<List<User>> findAll() {
        List<User> users = userRepository.findAll();
        return ResponseUtil.getSuccess(users);
    }

    public ResponseVo<User> addUser(UserDto userDto) {
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setPassword(UUID.randomUUID() + userDto.getPassword());
        user.setRoleId(userDto.getRoleId());
        return ResponseUtil.getSuccess(userRepository.save(user));
    }
}
