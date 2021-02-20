package jdbcMysqlTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class jdbcUtilTest {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;

        try {
            connection=JdbcUtil.getConnection();
            String sql="select * from student";
            statement=connection.createStatement();
            resultSet=statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.print("id:" + id + " ");
                System.out.print("name:" + name + " ");
                System.out.println("age:" + age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            JdbcUtil.close(connection,statement,resultSet);
        }
    }
}
