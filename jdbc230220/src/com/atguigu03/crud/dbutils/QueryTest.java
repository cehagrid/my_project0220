package com.atguigu03.crud.dbutils;

import com.atguigu02.druid.util.JDBCUtil;
import com.atguigu03.crud.bean.Customer;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * ClassName: QueryTests
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 2023/3/31 14:39
 */
public class QueryTest {

    /*
    * BeanHandler:对应的是查询表中的一条记录，封装为一个类的对象
    * */
    @Test
    public void test1() throws SQLException {
        //1.获取QueryRunner实例
        QueryRunner queryRunner = new QueryRunner();

        //2.1 传入query()中需要的参数
        Connection connection = JDBCUtil.getConnection();
        String sql = "select id,name,email,birth from customers where id = ?";
        //此ResultSetHandler的实例就决定了query()方法的返回值类型
//        Class<Customer> clazz = Customer.class;
        BeanHandler<Customer> handler = new BeanHandler<>(Customer.class);

        //2.2 通过QueryRunner实例调用query()方法，返回结果
        Customer customer = queryRunner.query(connection, sql, handler, 1);

        System.out.println(customer);
        //3.关闭资源
        JDBCUtil.closeResource(connection,null);
    }

    /*
     * BeanListHandler:对应的是查询表中的多条记录，封装为多个类的对象构成的List
     * */
    @Test
    public void test2() throws SQLException {
        //1.获取QueryRunner实例
        QueryRunner queryRunner = new QueryRunner();

        //2.1 传入query()中需要的参数
        Connection connection = JDBCUtil.getConnection();
        String sql = "select id,name,email,birth from customers where id <= ?";
        //此ResultSetHandler的实例就决定了query()方法的返回值类型

//        BeanListHandler<Customer> handler = new BeanListHandler<>(Customer.class);
        ResultSetHandler<List<Customer>> handler = new BeanListHandler<>(Customer.class);

        //2.2 通过QueryRunner实例调用query()方法，返回结果
        List<Customer> list = queryRunner.query(connection, sql, handler, 10);
        list.forEach(System.out::println);

        //3.关闭资源
        JDBCUtil.closeResource(connection,null);
    }

    /*
     * MapHandler:对应的是查询表中的一条记录，一条记录的多个字段作为map中的多个key-value出现
     * */
    @Test
    public void test3() throws SQLException {
        //1.获取QueryRunner实例
        QueryRunner queryRunner = new QueryRunner();

        //2.1 传入query()中需要的参数
        Connection connection = JDBCUtil.getConnection();
        String sql = "select id,name,email,birth from customers where id = ?";
        //此ResultSetHandler的实例就决定了query()方法的返回值类型
//        Class<Customer> clazz = Customer.class;
        MapHandler handler = new MapHandler();

        //2.2 通过QueryRunner实例调用query()方法，返回结果
        Map<String, Object> map = queryRunner.query(connection, sql, handler, 1);

        System.out.println(map);
        //3.关闭资源
        JDBCUtil.closeResource(connection,null);
    }

    //查询表中的一些特殊值：ScalarHandler
    @Test
    public void test4() throws SQLException {
        //1.获取QueryRunner实例
        QueryRunner queryRunner = new QueryRunner();

        //2.1 传入query()中需要的参数
        Connection connection = JDBCUtil.getConnection();
        String sql = "select count(*) from customers";

        ScalarHandler handler = new ScalarHandler();

        //2.2 通过QueryRunner实例调用query()方法，返回结果
        long count = (long) queryRunner.query(connection, sql, handler);

        System.out.println("表中一共有" + count + "条记录");
        //3.关闭资源
        JDBCUtil.closeResource(connection,null);
    }

    @Test
    public void test5() throws SQLException {
        //1.获取QueryRunner实例
        QueryRunner queryRunner = new QueryRunner();

        //2.1 传入query()中需要的参数
        Connection connection = JDBCUtil.getConnection();
        String sql = "select max(birth) from customers";

        ScalarHandler handler = new ScalarHandler();

        //2.2 通过QueryRunner实例调用query()方法，返回结果
        Date maxBirth = (Date)queryRunner.query(connection, sql, handler);

        System.out.println("最大的生日为：" + maxBirth);
        //3.关闭资源
        JDBCUtil.closeResource(connection,null);
    }
}
