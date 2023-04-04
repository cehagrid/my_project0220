package com.atguigu05.transaction;


import com.atguigu02.druid.util.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author 尚硅谷-宋红康
 * @create 17:01
 */
public class TransactionTest {

    @Test
    public void test1(){

        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();

            //1.
            connection.setAutoCommit(false);

            QueryRunner queryRunner = new QueryRunner();

            String sql1 = "update user_table set balance = balance - 100 where user = ?";
            String sql2 = "update user_table set balance = balance + 100 where user = ?";


            queryRunner.update(connection,sql1,"AA");

            //可能会出现异常
            System.out.println(10 / 0 );

            queryRunner.update(connection,sql2,"BB");

            //2. 提交数据
            connection.commit();
        } catch (Exception e) {
            e.printStackTrace();

            //3.回滚数据
            try {
                connection.rollback();
            } catch (SQLException ex) {
                e.printStackTrace();
            }

        } finally {
            JDBCUtil.closeResource(connection,null);
        }



    }

}
