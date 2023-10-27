package com.example.s_boot.SMS.controller;

import com.example.s_boot.SMS.models.Student;
import com.example.s_boot.SMS.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentsController {
    @Autowired
    public StudentService studentService;

    @GetMapping("/students")
    public String students(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }
    @GetMapping("/student/new")
    public String addStudent(Model model){
        Student student= new Student();
        model.addAttribute("student",student);
        return "new_student";
    }
    @PostMapping("/student")
    public String saveStudent(@ModelAttribute Student student){
        studentService.saveNewStudent(student);
        return "redirect:/students";
    }
    @GetMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
