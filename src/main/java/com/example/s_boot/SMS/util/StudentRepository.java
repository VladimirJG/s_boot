package com.example.s_boot.SMS.util;

import com.example.s_boot.SMS.models.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Component
public class StudentRepository {
    private static List<Student> students;
    private static int ID = 0;

    public StudentRepository() {
        if (students == null) {
            students = new ArrayList<>();
            students.add(new Student(Long.valueOf(++ID), "Taras", "Bulba", "tarasBul@ion.com"));
            students.add(new Student(Long.valueOf(++ID), "Kianu", "Rivs", "goodGay@org.yo"));
            students.add(new Student(Long.valueOf(++ID), "Michal", "Jekson", "blackWhite@rip.com"));
        }
    }

    public List<Student> findAll() {
        return students;
    }

    public Optional<Student> findById(Long id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    public Boolean deleteById(Long id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void save(Student student) {
        student.setId(Long.valueOf(++ID));
        students.add(student);
    }
}
