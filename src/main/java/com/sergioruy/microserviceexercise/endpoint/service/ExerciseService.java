package com.sergioruy.microserviceexercise.endpoint.service;

import com.sergioruy.microserviceexercise.model.Exercise;
import com.sergioruy.microserviceexercise.repository.ExerciseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ExerciseService {

    private final ExerciseRepository exerciseRepository;

    public Iterable<Exercise> list (Pageable pageable) {
        log.info("Listing all exercises");
        return exerciseRepository.findAll(pageable);
    }

}
