package springTest.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springTest.Student;

public class SpringApplicationTest {
    @Test
    public Student find(){
       // String[] strings={"1.xml","2.xml","3.xml"};配置多个xml文件
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("applicationContext.xml");//(string)
        Student student = (Student) applicationContext.getBean("student");
        return student;
    }
}
