package jdbcMysqlTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class C3p0Select{
    public static void main(String[] args){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection= C3p0DataSourceUtils.getConnection();
            String sql="insert into student(id,name,age) values(?,?,?)";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,33);
            preparedStatement.setString(2,"开心");
            preparedStatement.setInt(3,5);
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
