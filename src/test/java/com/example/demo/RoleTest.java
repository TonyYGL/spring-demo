package com.example.demo;

import com.example.demo.repository.RoleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RoleTest {

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void findAll_test() {
        System.out.println(roleRepository.findAll());
    }
}
