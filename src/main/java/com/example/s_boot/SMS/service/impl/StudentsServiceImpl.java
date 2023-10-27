package com.example.s_boot.SMS.service.impl;

import com.example.s_boot.SMS.models.Student;
import com.example.s_boot.SMS.service.StudentService;
import com.example.s_boot.SMS.util.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentsServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveNewStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    @Override
    public Boolean deleteStudentById(Long id) {
        return studentRepository.deleteById(id);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();

    }
}
