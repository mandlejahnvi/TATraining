package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //ApplicationContext context =new FileSystemXmlApplicationContext("config_original.xml");
        ApplicationContext context=new ClassPathXmlApplicationContext("config_original.xml");

        Emp e= (Emp) context.getBean("employee");

        System.out.println(e);
    }
}