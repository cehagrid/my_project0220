package com.atguigu03.crud.bean;

import java.sql.Date;

/**
 * ClassName: Customer
 * Description:
 *
 * ORM（object relational mapping）思想：
 * > 数据库中的一个表 对应 Java中的一个类
 * > 表中的一条记录   对应 Java类的一个对象
 * > 表中的一个字段(或列) 对应 Java类的一个属性
 *
 * @Author 尚硅谷-宋红康
 * @Create 2023/3/31 14:10
 */
public class Customer {
    private int id;
    private String name;
    private String email;
    private Date birth;

    public Customer() {
    }

    public Customer(int id, String name, String email, Date birth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birth = birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birth=" + birth +
                '}';
    }
}
