package com.si56baqi.Aop.dao.impl;

import com.si56baqi.Aop.dao.StudentDAO;
import com.si56baqi.Aop.entity.Student;
import com.si56baqi.Aop.mapper.StudentMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private SimpleJdbcCall jdbcCall;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcCall =  new SimpleJdbcCall(dataSource).
                withProcedureName("getRecord");
    }

    public void create(String name, Integer age) {
        JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
        String SQL = "insert into Student (name, age) values (?, ?)";
        jdbcTemplateObject.update( SQL, name, age);
        return;
    }

    public Student getStudent(Integer id) {
        return null;
    }

    public List<Student> listStudents() {
        JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
        String SQL = "select * from Student";
        List <Student> students = jdbcTemplateObject.query(SQL,new StudentMapper());
        return students;
    }

    public void delete(Integer id) {

    }

    public void update(Integer id, Integer age) {

    }
}
