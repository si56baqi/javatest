import com.si56baqi.Aop.dao.impl.StudentJDBCTemplate;
import com.si56baqi.Note.Student;
import com.si56baqi.SpringDI.JavaCollection;
import com.si56baqi.SpringDI.TextEditor;
import com.si56baqi.servcie.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloServiceTest {
/*   *//* @Test
    public void test1() throws Exception {
        /**
         * 1.加载Spring的配置文件
         * 2.取出Bean容器中的实例
         * 3.调用bean方法
         *//*
        // 1.加载Spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // 2.取出Bean容器中的实例
        HelloService helloService = (HelloService) context.getBean("helloService");
        // 3.调用bean方法
        //helloService.hello();
    }
    @Test
    public void scopeSingleton(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        HelloService helloService= (HelloService) applicationContext.getBean("helloService");
        helloService.setMessage("My helloService");
        helloService.getMessage();
        HelloService objB = (HelloService) applicationContext.getBean("helloService");
        objB.getMessage();
    }
   @Test
    public void springDi(){//构造器注入
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor");
        textEditor.spellCheck();
    }*/
    @Test
    public void javCollection(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        JavaCollection javaCollection = (JavaCollection) applicationContext.getBean("javaCollection");
        javaCollection.getAddressList();
        javaCollection.getAddressMap();
        javaCollection.getAddressProp();
        javaCollection.getAddressSet();
    }
    @Test
    public void note() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student= (Student) applicationContext.getBean("student");
        Integer age = student.getAge();
        String name = student.getName();
        System.out.println("Name:"+name+">>>>>>>age:"+age);
    }
    @Test
    public void springJdbc() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");
        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) applicationContext.getBean("studentJDBCTemplate");
        studentJDBCTemplate.create("Zara", 11);
        studentJDBCTemplate.create("Nuha", 2);
        studentJDBCTemplate.create("Ayan", 15);

        System.out.println(studentJDBCTemplate.listStudents().size());
    }
}
