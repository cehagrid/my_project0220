package com.atguigu02.druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author 尚硅谷-宋红康
 * @create 11:14
 */
public class DruidTest {

    /*
    * 使用Druid实现数据库的连接方式1：
    * */
    @Test
    public void testGetConnection1() throws SQLException {
        //创建了数据库连接池
        DruidDataSource source = new DruidDataSource();

        //设置获取连接的基本信息
        source.setUsername("root");
        source.setPassword("abc123");
        source.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC");
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");

        //体现数据库连接池的管理
        source.setInitialSize(10);
        source.setMaxActive(100);

        //获取数据库连接池中的连接
        Connection connection = source.getConnection();
        System.out.println(connection);

    }

    /*
     * 使用Druid实现数据库的连接方式2：使用配置文件
     * */
    @Test
    public void testGetConnection2() throws Exception {
        //获取Properties的实例，加载流中的配置信息
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
        Properties pros = new Properties();
        pros.load(is);

        //创建了一个DataSource的实例（获取了一个数据库连接池）
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pros);
        //从连接池中取一个连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
