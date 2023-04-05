package com.example.aop._1;

import org.springframework.stereotype.Component;

@Component("unil")
public class UniLibrary {

    public void returnMagazine() {
        System.out.println("********UniLibrary returnMagazine()*******");
        System.out.println("------------------------------------------");
    }

    public void addBook(String name, Book book) {
        System.out.println("********UniLibrary void addBook(String name, Book book)*******");
        System.out.println("------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("********UniLibrary void addMagazine()*******");
        System.out.println("------------------------------------------");
    }
}