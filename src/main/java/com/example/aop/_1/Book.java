package com.example.aop._1;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("book")
@Getter
public class Book {

    @Value("War and Peace")
    private String name;

    @Value("Tolstoy L.N.")
    private String author;

    @Value("1867")
    private int issue;
}