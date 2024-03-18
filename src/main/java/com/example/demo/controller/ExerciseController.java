package com.example.demo.controller;

import com.example.demo.dto.ExerciseScheduleDto;
import com.example.demo.entity.ExerciseCategory;
import com.example.demo.entity.ExerciseSchedule;
import com.example.demo.service.ExerciseService;
import com.example.demo.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @GetMapping("/category/all")
    public ResponseVo<List<ExerciseCategory>> findAllCategory() {
        return exerciseService.findAllCategory();
    }

    @PostMapping("/addSchedule")
    public ResponseVo<ExerciseSchedule> addExerciseSchedule(@RequestBody ExerciseScheduleDto exerciseScheduleDto) {
        return exerciseService.addExerciseSchedule(exerciseScheduleDto);
    }

}
