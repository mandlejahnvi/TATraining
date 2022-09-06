package com.springjdbc.dao;

import com.springjdbc.entities.Student;

import java.util.List;

public interface StudentDao {
    public int add(Student stud);

    public int update(Student stud);

    public int delete(int id);

    public Student getStudent(int id);

    public List<Student> getStudents();
}
