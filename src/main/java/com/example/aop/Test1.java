package com.example.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        Library library = context.getBean("libraryBean", Library.class);
//        library.getBook();
//
//        context.close();

        University university = context.getBean("univer", University.class);
        university.addStudents();
        List<Student> students = university.getStudents();

        System.out.println(students);
        context.close();

    }
}
