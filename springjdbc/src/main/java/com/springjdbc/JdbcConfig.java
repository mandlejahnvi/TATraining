package com.springjdbc;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Driver;
@Configuration
@ComponentScan(basePackages = {"com.springjdbc.dao"})
public class JdbcConfig {

    @Bean(name ={"ds"})
    public DataSource getDataSource()
    {
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("root12");
        return ds;
    }

     @Bean(name={"JdbcTemplate"})
     public JdbcTemplate getTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
     }

//     @Bean(name = {"StudentDao"})
//    public StudentDao getStudentDao()
//     {
//         StudentDaoImpl studentDao = new StudentDaoImpl();
//         studentDao.setJdbcTemplate(getTemplate());
//         return studentDao;
//     }

}
