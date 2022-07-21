package com.sergioruy.microserviceexercise.repository;

import com.sergioruy.microserviceexercise.model.Exercise;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ExerciseRepository extends PagingAndSortingRepository<Exercise, Long> {
}
