package JdbcTemplate.service;

import JdbcTemplate.entity.Student;

import java.util.List;

public interface JdbcTemplateService {
    public void update(String sql,Object ...args);
    //删除账户
    public int delAccount(int id);

    //添加用户
    public Student addAccount(Student account);

    //修改账户
    public Student updaAccount(Student account);

    public List<Student> allstu();
}
