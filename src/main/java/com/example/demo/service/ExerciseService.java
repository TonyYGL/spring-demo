package com.example.demo.service;

import com.example.demo.dto.ExerciseScheduleDto;
import com.example.demo.entity.ExerciseCategory;
import com.example.demo.entity.ExerciseSchedule;
import com.example.demo.repository.ExerciseCategoryRepository;
import com.example.demo.repository.ExerciseScheduleRepository;
import com.example.demo.vo.ResponseUtil;
import com.example.demo.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseCategoryRepository exerciseCategoryRepository;

    @Autowired
    private ExerciseScheduleRepository exerciseScheduleRepository;

    public ResponseVo<List<ExerciseCategory>> findAllCategory() {
        return ResponseUtil.getSuccess(exerciseCategoryRepository.findAll());
    }

    public ResponseVo<ExerciseSchedule> addExerciseSchedule(ExerciseScheduleDto exerciseScheduleDto) {
        ExerciseSchedule exerciseSchedule = new ExerciseSchedule();
        exerciseSchedule.setUserId(exerciseScheduleDto.getUserId());
        exerciseSchedule.setStartDate(exerciseScheduleDto.getStartDate());
        exerciseSchedule.setStartTime(exerciseScheduleDto.getStartTime());
        exerciseSchedule.setEndTime(exerciseScheduleDto.getEndTime());
        exerciseSchedule.setCreatedAt(new Date());
        exerciseSchedule.setModifiedAt(new Date());
        return ResponseUtil.getSuccess(exerciseScheduleRepository.save(exerciseSchedule));
    }
}
