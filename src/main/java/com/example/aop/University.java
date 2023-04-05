package com.example.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("univer")
public class University {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        System.out.println("Info: getStudents()");
        System.out.println(students);
        return students;
    }

    public void addStudents() {
        students.add(new Student("Misha", 4, 9.5));
        students.add(new Student("Anna", 5, 8.2));
        students.add(new Student("Elena", 3, 6.5));
    }
}
