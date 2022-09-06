package com.springjdbc.dao;

import com.springjdbc.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("StudentDao")

public class StudentDaoImpl implements StudentDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int add(Student stud) {
        String query="insert into Student (id,name,city) values (?,?,?)";
        int result = this.jdbcTemplate.update(query,stud.getId(),stud.getName(),stud.getCity());
        return result;
    }

    @Override
    public int update(Student stud) {
        int id= stud.getId();
        String query="update Student set name = ?, city = ? where id =?";
        int result =this.jdbcTemplate.update(query,stud.getName(),stud.getCity(),stud.getId());
        return  result;
    }

    @Override
    public int delete(int id) {
        String query="delete from student where id =?";
        int result =this.jdbcTemplate.update(query,id);
        return result;
    }

    @Override
    public Student getStudent(int id) {
        String query="Select * from student where id= ?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        Student stud=this.jdbcTemplate.queryForObject(query,rowMapper,id);
        return stud;
    }

    @Override
    public List<Student> getStudents() {
        String query="Select * from student";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        List<Student> stud=this.jdbcTemplate.query(query,rowMapper);
        return stud;
    }

    public JdbcTemplate getJdbcTemplate()
    {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate=jdbcTemplate;
    }
}
