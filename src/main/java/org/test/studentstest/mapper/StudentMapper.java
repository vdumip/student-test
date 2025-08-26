package org.test.studentstest.mapper;

import org.test.studentstest.dto.StudentRequestDto;
import org.test.studentstest.dto.StudentResponseDto;
import org.test.studentstest.model.Student;
import org.test.studentstest.model.StudentStatus;

public final class StudentMapper {

    private StudentMapper() {}

    public static Student toEntity(StudentRequestDto req) {
        Student s = new Student();
        s.setFirstName(normalize(req.getFirstName()));
        s.setLastName(normalize(req.getLastName()));
        s.setEmail(normalizeEmail(req.getEmail()));
        s.setDateOfBirth(req.getDateOfBirth());
        s.setStatus(req.getStatus() != null ? req.getStatus() : StudentStatus.ACTIVE);
        return s;
    }

    public static StudentResponseDto toResponse(Student s) {
        StudentResponseDto resp = new StudentResponseDto();
        resp.setId(s.getId());
        resp.setFirstName(s.getFirstName());
        resp.setLastName(s.getLastName());
        resp.setEmail(s.getEmail());
        resp.setDateOfBirth(s.getDateOfBirth());
        resp.setStatus(s.getStatus());
        resp.setCreatedAt(s.getCreatedAt());
        resp.setUpdatedAt(s.getUpdatedAt());
        return resp;
    }

    private static String normalizeEmail(String email) {
        return email == null ? null : email.trim().toLowerCase();
    }

    private static String normalize(String s) {
        return s == null ? null : s.trim();
    }

    private static String trim(String s) {
        return s == null ? null : s.trim();
    }
}
