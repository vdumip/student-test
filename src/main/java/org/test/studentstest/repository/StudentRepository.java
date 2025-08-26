package org.test.studentstest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.studentstest.model.Student;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {
    boolean existsByEmailIgnoreCase(String email);
}
