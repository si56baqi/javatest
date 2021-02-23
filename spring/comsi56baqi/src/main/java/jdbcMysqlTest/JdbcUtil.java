package jdbcMysqlTest;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtil {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    static {
        try{
            //新建属性对象集
            Properties properties=new Properties();
            //通过反射，新建字符输入流，读取db.properties文件
            InputStream inputStream=JdbcUtil.class.getClassLoader().getResourceAsStream("db.properties");
            //将输入流中读取到的属性，加载到properties属性集对象中
            properties.load(inputStream);
            //将流的属性加载到properties属性中
            driver=properties.getProperty("driver");
            url=properties.getProperty("url");
            user=properties.getProperty("user");
            password=properties.getProperty("password");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //返回数据库连接
    public static Connection getConnection(){
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取数据库连接（主机，用户名，密码）
            Connection connection= DriverManager.getConnection(url,user,password);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 关闭链接，释放资源
     */
    public static void close(Connection connection, Statement statement, ResultSet resultSet) {

        try {
            if (resultSet != null) {
                resultSet.close();
            }
            resultSet = null; // 垃圾及时清除
            //注意，不要弄成死循环
            close(connection, statement);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * 增删改释放资源
     */
    public static void close(Connection connection, Statement statement) {
        try {
            if (connection != null) {
                connection.close();
            }
            connection = null;
            if (statement != null) {
                statement.close();
            }
            statement = null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
/**jdbc连接数据库的步骤
 * 1.加载驱动
 * Class.forName("")
 *2.建立连接
 * Connection con=DriverManage.getConnection(url,user,password)
 *3.执行sql返回结果
 * String sql=""
 * Statement stat=con.createStatement()//创建Statement
 * ResultSet rs=stat.executeQuery(sql)//执行sql
 *4.处理结果
 * while(rs.next()){
 *     int id = rs.getInt("id");
 *     string Name =rs.getstring("Name")
 * }
 *5.关闭连接
 * stat.close()
 * rs.close()
 * con.close()
 *
 *  preparedStatement 与 Statement的区别
 *   (1) 提高代码的可维护性和可读性。
 *  （2）提高了SQL语句执行的性能。
 *  （3） 提高了安全性。
 *
 * */
