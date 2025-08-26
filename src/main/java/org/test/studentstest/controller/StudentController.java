package org.test.studentstest.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.studentstest.dto.StudentCreateRequest;
import org.test.studentstest.dto.StudentResponse;
import org.test.studentstest.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<StudentResponse> createStudent(@Valid @RequestBody StudentCreateRequest request) {
        // TODO: Implement this
        return ResponseEntity.ok().build();
    }

    // TODO: Implement remaining CRUD operations (GET by id, list, update, delete) during the interview
    // TODO: Implement assigning students to subjects (many-to-many) during the interview
}
