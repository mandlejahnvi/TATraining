package com.springhibernate.dao;

import com.springhibernate.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
//import org.springframework.transaction.annotation.Transactional;

public class StudentDao {
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public int insert(Student student)
    {
        Integer result= (Integer) this.hibernateTemplate.save(student);
        return result;
    }

    public HibernateTemplate getHibernateTemplate()
    {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
