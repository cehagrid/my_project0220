package com.atguigu.day11;
/*
（1）声明员工类Employee，

- 包含属性：姓名、性别、年龄、工资、电话、邮箱，属性私有化
- 提供get/set方法
- ==提供无参构造==
- ==提供有参构造Employee(String name, char gender, int age, double salary, String phone, String email)==
- 提供String getInfo()方法


 */
public class Employee {
    private String name;
    private Gender gender;
    private int age;
    private double salary;
    private String phone;
    private String email;

    public Employee(String name, Gender gender, int age, double salary, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


