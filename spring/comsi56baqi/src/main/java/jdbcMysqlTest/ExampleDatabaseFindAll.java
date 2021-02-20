package jdbcMysqlTest;


import java.sql.*;

public class ExampleDatabaseFindAll {

    public static void main(String[] args){
       // ExampleDatabase.main(args);
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql="select * from student";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT","root","root");
            statement=connection.createStatement();
            resultSet=statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString(2);
                int age = resultSet.getInt("age");
                System.out.print("id:" + id + " ");
                System.out.print("name:" + name + " ");
                System.out.println("age:" + age);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}

