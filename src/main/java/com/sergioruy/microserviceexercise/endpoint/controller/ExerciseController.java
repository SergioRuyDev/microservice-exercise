package com.sergioruy.microserviceexercise.endpoint.controller;

import com.sergioruy.microserviceexercise.endpoint.service.ExerciseService;
import com.sergioruy.microserviceexercise.model.Exercise;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/admin/exercises")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ExerciseController {

    private final ExerciseService exerciseService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Exercise>> list(Pageable pageable) {
        return new ResponseEntity<>(exerciseService.list(pageable), HttpStatus.OK);
    }
}
