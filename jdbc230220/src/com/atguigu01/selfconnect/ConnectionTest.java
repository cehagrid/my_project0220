package com.atguigu01.selfconnect;


import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 如何手动获取数据库的连接
 *
 * @author 尚硅谷-宋红康
 * @create 8:52
 */
public class ConnectionTest {

    //获取mysql数据库的连接方式1
    /*
    * 主要使用DriverManager类实现，先后调用其两个方法：
    * registerDriver(..)
    * getConnection(..,..,..)
    * */
    @Test
    public void testGetConnection1() throws SQLException {

        //实例化Driver时，需要传入mysql数据库的Driver接口的实现类的对象
        Driver driver = new com.mysql.cj.jdbc.Driver();

        //注册驱动
        DriverManager.registerDriver(driver);

        //提供获取连接的基本信息：
        String user = "root";
        String password = "abc123";
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC"; //指明具体要连接的数据库
        //获取连接
        Connection conn = DriverManager.getConnection(url,user,password);
        System.out.println(conn);

    }

    //获取mysql数据库的连接方式2
    //针对于方式1的优化：使用反射创建mysql数据库的Driver接口的实现类的对象
    @Test
    public void testGetConnection2() throws Exception, IllegalAccessException {
        //实例化Driver时，需要传入mysql数据库的Driver接口的实现类的对象
        String className = "com.mysql.cj.jdbc.Driver";
        Class clazz = Class.forName(className);
        Driver driver = (Driver) clazz.getDeclaredConstructor().newInstance();

        //注册驱动
        DriverManager.registerDriver(driver);

        //提供获取连接的基本信息：
        String user = "root";
        String password = "abc123";
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC"; //指明具体要连接的数据库
        //获取连接
        Connection conn = DriverManager.getConnection(url,user,password);


        System.out.println(conn);
    }

    //获取mysql数据库的连接方式3
    //针对于方式2的优化：可以省略注册的过程
    @Test
    public void testGetConnection3() throws Exception, IllegalAccessException {
        //实例化Driver时，需要传入mysql数据库的Driver接口的实现类的对象
        String className = "com.mysql.cj.jdbc.Driver";
        //加载驱动
        Class.forName(className);

        //可以省略如下的操作
//        Driver driver = (Driver) clazz.getDeclaredConstructor().newInstance();
//        //注册驱动
//        DriverManager.registerDriver(driver);

        //因为，我们在mysql的Driver类中发现了如下的代码，如下的代码已经注册了驱动
        /*
        *  static {
                try {
                    java.sql.DriverManager.registerDriver(new Driver());
                } catch (SQLException E) {
                    throw new RuntimeException("Can't register driver!");
                }
            }
        * */

        //提供获取连接的基本信息：
        String user = "root";
        String password = "abc123";
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC"; //指明具体要连接的数据库
        //获取连接
        Connection conn = DriverManager.getConnection(url,user,password);


        System.out.println(conn);
    }


    //获取mysql数据库的连接方式4:使用配置文件的方式保存配置信息
    //针对于方式3的优化。
    /*
    * 好处：实现了代码和数据的分离，解耦；如果修改配置信息的话，此种方式省去了重新编译、打包的过程，节省时间。
    * */
    @Test
    public void testGetConnection4() throws Exception, IllegalAccessException {
        //读取配置文件中的获取数据库连接的4个基本信息
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties pros = new Properties();
        pros.load(is);

        String className = pros.getProperty("className");
        String url = pros.getProperty("url");
        String userName = pros.getProperty("userName");
        String password = pros.getProperty("password");

        //加载驱动
        Class.forName(className);

        //获取连接
        Connection connection = DriverManager.getConnection(url, userName, password);
        System.out.println(connection);

    }
}
