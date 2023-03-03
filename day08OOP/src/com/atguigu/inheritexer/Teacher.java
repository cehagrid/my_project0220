package com.atguigu.inheritexer;

public class Teacher extends Person{
    private int salary;

    public Teacher() {
    }

    public Teacher(String name, int age, char gender, int salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getInfo() {
        return super.getInfo() + "\t工资:" + salary;
    }
}


