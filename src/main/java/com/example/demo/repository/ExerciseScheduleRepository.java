package com.example.demo.repository;

import com.example.demo.entity.ExerciseSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseScheduleRepository extends JpaRepository<ExerciseSchedule, Long> {
}
