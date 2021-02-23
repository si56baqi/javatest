package JdbcTemplate.test;

import JdbcTemplate.dao.JdbcTemplateDao;
import JdbcTemplate.entity.Student;
import JdbcTemplate.service.JdbcTemplateService;
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
    @Test
    public void test03(){
        JdbcTemplateDao dao = ioc.getBean(JdbcTemplateDao.class);
        /*String sql = "INSERT INTO student(id,name,age)VALUES(?,?,?)";
        dao.update(sql, 2,"比尔盖茨",10);*/
        dao.update(null,null);
    }
    @Test
    public void test04(){
        JdbcTemplateService jdbcTemplateService=ioc.getBean(JdbcTemplateService.class);
        jdbcTemplateService.update(null,null);
    }
    @Test
    public void test05(){
        JdbcTemplateService jdbcTemplateService=ioc.getBean(JdbcTemplateService.class);
        jdbcTemplateService.delAccount(34);
    }
    @Test
    public void test06(){
        JdbcTemplateService jdbcTemplateService=ioc.getBean(JdbcTemplateService.class);
        Student student=new Student();
        jdbcTemplateService.addAccount(student);
    }
    @Test
    public void test07(){
        JdbcTemplateService jdbcTemplateService=ioc.getBean(JdbcTemplateService.class);
        List<Student> allstu = jdbcTemplateService.allstu();
        System.out.println(allstu);
    }
}

