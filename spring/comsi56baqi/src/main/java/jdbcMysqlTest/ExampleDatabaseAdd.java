package jdbcMysqlTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleDatabaseAdd {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        String insert="insert into student (id, name, age) values (5, 'ke', 23)";
        String update="update student set name ='小虎呀' where id=3";
        String delete="delete from student where id=12";
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT","root","root");
            //实例化Statement对象
            statement=connection.createStatement();
            statement.executeUpdate(insert);
            statement.executeUpdate(update);
            statement.executeUpdate(delete);
        }catch (SQLException e){
            e.printStackTrace();
        }
        try {
            statement.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
/**
 * JDBC中，PreparedStatement相较于Statement有什么优点？
 *
 * 1）PreparedStatement可以使用预编译的sql，而Statment只能使用静态的sql
 *
 * 2）PreparedStatement可以使用sql缓存区，效率比Statment高
 *
 * 3）PreparedStatement可以有效防止sql注入，而Statment不能防止sql注入。
 *
 * JDBC中如何进行事务处理？
 *
 * 答：一个事务是由一条或多条对数据库操作的SQL语句所组成的一个不可分割的工作单元，只有当事务中的所有操作都正常执行了，整个事务才会被提交给数据库。在JDBC中，一般是通过commit()方法或rollback()方法来结束事务的操作。其中commit()方法表示完成对事务的提交，rollback()方法表示完成事务回滚，多用于在处理事务的过程中出现了异常的情况，这两种方法都位于java.sql.Connection类中。一般而言，事务默认操作是自动提交，即操作成功后，系统将自动调用commit()方法，否则将调用rollback()方法。
 *
 * 当然，在JDBC中，也可以通过调用setAutoCommit(false)方法来禁止自动提交，然后就可以把多个数据库操作的表达式作为一个事务，在操作完成后调用commit()方法实现整体提交，如果其中一个表达式操作失败，就会抛出异常而不会调用commit()方法。在这种情况下，就可以在异常捕获的代码块中调用rollback()进行事务回滚。通过此种方法可以保持对数据库的多次操作后，数据仍然保持一致性。
 *
 *
 *
 * 在进行数据库编程时，连接池有什么作用？
 *
 * 答：实际开发中“获得连接”或“释放资源”是非常消耗系统资源的两个过程，为了解决此类性能问题，通常情况我们采用连接池技术，来共享连接Connection。
 *
 * 用池来管理Connection，这样可以重复使用Connection。有了池，所以我们就不用自己来创建Connection，而是通过池来获取Connection对象。当使用完Connection后，调用Connection的close()方法也不会真的关闭Connection，而是把Connection“归还”给池。池就可以再利用这个Connection对象了。
 *
 *
 * **/
