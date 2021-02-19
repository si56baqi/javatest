package mysqlTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExampleDatabase {
    //定义驱动
    public static final String DBDRIVER="com.mysql.jdbc.Driver";
    /**
     *
     * static关键字最基本的用法是：
     *
     * 1、被static修饰的变量属于类变量，可以通过类名.变量名直接引用，而不需要new出一个类来
     *
     * 2、被static修饰的方法属于类方法，可以通过类名.方法名直接引用，而不需要new出一个类来
     *
     * 被static修饰的变量、被static修饰的方法统一属于类的静态资源，是类实例之间共享的，换言之，一处变、处处变。JDK把不同的静态资源放在了不同的类中而不把所有静态资源放在一个类里面，很多人可能想当然认为当然要这么做，但是是否想过为什么要这么做呢？个人认为主要有三个好处：
     *
     * 1、不同的类有自己的静态资源，这可以实现静态资源分类。比如和数学相关的静态资源放在java.lang.Math中，和日历相关的静态资源放在java.util.Calendar中，这样就很清晰了
     *
     * 2、避免重名。不同的类之间有重名的静态变量名、静态方法名也是很正常的，如果所有的都放在一起不可避免的一个问题就是名字重复，这时候怎么办？分类放置就好了。
     *
     * 3、避免静态资源类无限膨胀，这很好理解。
     *
     *
     * */
    /**
     * 在Java中，final关键字可以用来修饰类、方法和变量（包括成员变量和局部变量）。
     * 1、修饰类
     * 当用final修饰一个类时，表明这个类不能被继承。
     * 也就是说，如果一个类你永远不会让他被继承，就可以用final进行修饰。
     * final类中的成员变量可以根据需要设为final，但是要注意final类中的所有成员方法都会被隐式地指定为final方法。
     *2、修饰方法
     * 方法不能被重写（可以重载多个final修饰的方法）。此处需要注意的一点是：因为重写的前提是子类可以从父类中继承此方法，
     * 如果父类中final修饰的方法同时访问控制权限为private，将会导致子类中不能直接继承到此方法，
     * 因此，此时可以在子类中定义相同的方法名和参数，此时不再产生重写与final的矛盾，而是在子类中重新定义了新的方法。
     *3、修饰变量
     *final成员变量表示常量，只能被赋值一次，赋值后值不再改变。
     *当final修饰一个基本数据类型时，表示该基本数据类型的值一旦在初始化后便不能发生变化；
     * 如果final修饰一个引用类型时，则在对其初始化之后便不能再让其指向其他对象了，
     * 但该引用所指向的对象的内容是可以发生变化的。本质上是一回事，因为引用的值是一个地址，final要求值，即地址的值不发生变化。
     * **/
    //定义连接地址
    public static final String DBURL="jdbc:mysql://localhost:3306/test?serverTimezone=GMT";
    /***
     *serverTimeZone的作用就是指定web服务器和mysql服务器的会话期间的mysql服务器时区，就是临时指定mysql服务器的时区。
     * GMT:北京时间也是东八区时间
     *
     */
    //定义用户名，密码
    public static final String DBUSER="root";
    public static final String DBPASSWORD="root";

    public static void main(String[] args) {
        //连接数据库
        Connection connection=null;

        //加载驱动
        try {
            Class.forName(DBDRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection= DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("链接地址"+connection);
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
