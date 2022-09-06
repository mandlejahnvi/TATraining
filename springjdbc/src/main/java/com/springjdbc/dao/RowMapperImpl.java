package com.springjdbc.dao;

import com.springjdbc.entities.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Student> {

    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student1= new Student();
        student1.setId(rs.getInt(1));
        student1.setName(rs.getString(2));
        student1.setCity(rs.getString(3));
        return student1;
    }
}
