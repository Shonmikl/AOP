package com.example.aop._1;

import com.example.aop.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                 = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("unil", UniLibrary.class);
        Book book = context.getBean("book", Book.class);

        uniLibrary.addBook("Petr", book);
        uniLibrary.addMagazine();

        context.close();
    }
}
