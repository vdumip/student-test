package org.test.studentstest.service;

import org.springframework.stereotype.Service;
import org.test.studentstest.repository.StudentRepository;

@Service
public class StudentService {

    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
