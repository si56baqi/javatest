package JdbcTemplate.test;

import JdbcTemplate.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public class StudentTest {
    private ApplicationContext ioc = new ClassPathXmlApplicationContext("jdbc.xml");
    private JdbcTemplate template=ioc.getBean(JdbcTemplate.class);
    //测试数据库连接
    @Test
    public void getAllAccount() throws SQLException {

        DataSource bean = ioc.getBean(DataSource.class);
        System.out.println(bean.getConnection());

    }
    //查询最大年龄
    @Test
    public void test01(){
        String sql = "SELECT MAX(age) FROM student";
        //需要指定返回值的类型,而且类型必须是包装类型
        Integer maxSalary = template.queryForObject(sql, Integer.class);
        System.out.println(maxSalary);
    }
    @Test
    public void test02(){
        String sql = "SELECT id ,name, age FROM student WHERE id=?";
        //RowMapper是一个接口,这里我们使用其子类
        RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
        //最后一个参数是可变参数，用于向sql语句中依次传递参数!
        Student employee = template.queryForObject(sql, rowMapper, 5);
        System.out.println(employee);
    }

}

