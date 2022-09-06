package com.springjdbc;
import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
       // JdbcTemplate template =context.getBean("jdbcTemplate", JdbcTemplate.class);
        //String query= "INSERT into Student (id, name, city) values(?,?,?)";

        StudentDao studentDao= context.getBean("StudentDao", StudentDao.class);

        Student stud= new Student();
        stud.setId(102);
        stud.setName("Pooja");
        stud.setCity("Pune");
        //int result= studentDao.update(stud);
        //int result= studentDao.delete(102);
        //Student stud1= studentDao.getStudent(101);
        List<Student> list=studentDao.getStudents();
        System.out.println(list);
    }
}