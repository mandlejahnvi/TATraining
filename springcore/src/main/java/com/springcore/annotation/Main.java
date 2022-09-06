package com.springcore.annotation;

import com.springcore.amb.Addition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //ApplicationContext context =new FileSystemXmlApplicationContext("config_original.xml");
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

        Student stud1= (Student) context.getBean("stud1");

        System.out.println(stud1);
    }
}