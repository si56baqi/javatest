package jdbcMysqlTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class C3p0Select{
    public static void main(String[] args){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            connection= C3p0DataSourceUtils.getConnection();
            String sql="insert into student(id,name,age) values(?,?,?)";
            String select="select * from student";
            String delete="delete from student where id=32";
            String update="update from student set name='Anli' where id=33";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,34);
            preparedStatement.setString(2,"开心");
            preparedStatement.setInt(3,5);
            //查询
            //preparedStatement=connection.prepareStatement(select);
          // resultSet= preparedStatement.executeQuery();
            //修改
            //preparedStatement=connection.prepareStatement(update);
            //preparedStatement.executeUpdate();
            /*while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString(2);
                int age = resultSet.getInt("age");
                System.out.print("id:" + id + " ");
                System.out.print("name:" + name + " ");
                System.out.println("age:" + age);
            }*/
            //删除
            //preparedStatement=connection.prepareStatement(delete);
            //preparedStatement.executeUpdate();
            int rows=preparedStatement.executeUpdate();
            if (rows>0){
                System.out.println("添加成功");
            }else {
                System.out.println("添加失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            C3p0DataSourceUtils.CloseResource(connection,preparedStatement,null);
        }

    }
}
