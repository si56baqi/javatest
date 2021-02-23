package JdbcTemplate.dao.impl;

import JdbcTemplate.dao.JdbcTemplateDao;
import JdbcTemplate.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcTemplateDaoImpl implements JdbcTemplateDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void update(String sql, Object... args) {
         sql="INSERT INTO student(id,name,age)VALUES(?,?,?)";
        jdbcTemplate.update(sql,7,"盖盖",18);
    }
    //删除
    @Override
    public int delAccount(int id) {
        String sql="delete from student where id=?";
        int update = jdbcTemplate.update(sql,id);
        return update;
    }
    //添加
    @Override
    public Student addAccount(Student account) {
        String sql="INSERT INTO student(id,name,age)VALUES(?,?,?)";
        jdbcTemplate.update(sql, 9,"bb",12);
        return account;
    }
    //修改
    @Override
    public Student updaAccount(Student account) {
        return null;
    }

    @Override
    public List<Student> allstu() {
        String sql="select * from student";
        RowMapper<Student> rowMapper= new BeanPropertyRowMapper<>(Student.class);
        List<Student> query = jdbcTemplate.query(sql, rowMapper);
        return query;
    }

}
