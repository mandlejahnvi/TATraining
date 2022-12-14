package com.springcore.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.noxml")
public class Javaconfig {

    @Bean
    public Student getStudent()
    {
        Student student = new Student(getEmployee());
        return student;
    }

    @Bean
    public Employee getEmployee()
    {
        return new Employee();
    }
}
