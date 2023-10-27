package com.example.s_boot.SMS.service;

import com.example.s_boot.SMS.models.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveNewStudent(Student student);

    Boolean deleteStudentById(Long id);

    Student getStudentById(Long id);
}
