package com.springcore;

import com.springcore2.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //ApplicationContext context =new FileSystemXmlApplicationContext("config_original.xml");
        ApplicationContext context=new ClassPathXmlApplicationContext("config_original.xml");
        Student student1 =(Student) context.getBean("student3");
        Employee emp =(Employee) context.getBean("employee1");
        System.out.println(emp);
    }
}