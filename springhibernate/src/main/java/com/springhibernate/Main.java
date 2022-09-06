package com.springhibernate;

import com.springhibernate.dao.StudentDao;
import com.springhibernate.entities.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
        Student student= new Student(101, "Jahnvi","Pune");
        int result =studentDao.insert(student);
        System.out.println(result);
    }
}