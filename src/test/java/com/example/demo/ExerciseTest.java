package com.example.demo;

import com.example.demo.repository.ExerciseCategoryRepository;
import com.example.demo.repository.RoleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExerciseTest {

    @Autowired
    private ExerciseCategoryRepository exerciseCategoryRepository;

    @Test
    public void findAllCategory_test() {
        System.out.println(exerciseCategoryRepository.findAll());
    }
}
