package mysqlTest;

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
