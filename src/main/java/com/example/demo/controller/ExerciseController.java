package com.example.demo.controller;

import com.example.demo.entity.ExerciseCategory;
import com.example.demo.repository.ExerciseCategoryRepository;
import com.example.demo.vo.ResponseUtil;
import com.example.demo.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

    @Autowired
    private ExerciseCategoryRepository exerciseCategoryRepository;

    @GetMapping("/category/all")
    public ResponseVo<List<ExerciseCategory>> userTest() {
        return ResponseUtil.getSuccess(exerciseCategoryRepository.findAll());
    }

}
