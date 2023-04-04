package com.atguigu03.crud.dbutils;

import com.atguigu02.druid.util.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * ClassName: UpdateTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 2023/3/31 14:27
 */
public class UpdateTest {

    //实现更新的操作
    @Test
    public void test1() throws SQLException {
        //1.QueryRunner的实例化
        QueryRunner queryRunner = new QueryRunner();

        Connection connection = JDBCUtil.getConnection();
        String sql = "update customers set email = ? where id = ?";
        //2. QueryRunner的实例调用update()
        int updateCount = queryRunner.update(connection, sql, "chen@gmail.com", 8);
        System.out.println("更新了" + updateCount + "条记录");

        //3.关闭资源
        JDBCUtil.closeResource(connection,null);

    }

    //实现添加的操作
    @Test
    public void test2() throws SQLException {
        //1.QueryRunner的实例化
        QueryRunner queryRunner = new QueryRunner();

        Connection connection = JDBCUtil.getConnection();
        String sql = "insert into customers(name,email,birth) values (?,?,?)";
        //2. QueryRunner的实例调用update()
        int updateCount = queryRunner.update(connection, sql, "蔡徐坤","cai@126.com","2015-12-21");
        System.out.println("添加了" + updateCount + "条记录");

        //3.关闭资源
        JDBCUtil.closeResource(connection,null);

    }
}
