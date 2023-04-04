package com.atguigu02.druid.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * ClassName: JDBCUtil
 * Description:
 * 使用JDBC操作数据库的工具类
 *
 * @Author 尚硅谷-宋红康
 * @Create 2023/3/31 11:49
 */
public class JDBCUtil {

    //方式1：不推荐
    //原因：每次获取一个连接，都需要创建一个数据库连接池，成本极高！
    public static Connection getConnection1() throws Exception {
        //获取Properties的实例，加载流中的配置信息
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
        Properties pros = new Properties();
        pros.load(is);

        //创建了一个DataSource的实例（获取了一个数据库连接池）
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pros);
        //从连接池中取一个连接
        Connection connection = dataSource.getConnection();

        return connection;
    }


    //创建了一个DataSource的实例（获取了一个数据库连接池）
    private static DataSource dataSource = null;

    static {
        try {
            //获取Properties的实例，加载流中的配置信息
            InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
            Properties pros = new Properties();
            pros.load(is);

            //创建了一个DataSource的实例（获取了一个数据库连接池）
            dataSource = DruidDataSourceFactory.createDataSource(pros);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        return connection;
    }

    //关闭相关的操作
    public static void closeResource(Connection connection, PreparedStatement preparedStatement) {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (preparedStatement != null)
                preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //关闭相关的操作
    public static void closeResource(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (preparedStatement != null)
                preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (resultSet != null)
                resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
