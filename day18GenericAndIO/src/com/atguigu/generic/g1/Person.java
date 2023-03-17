package com.atguigu.generic.g1;

public class Person {

    double salary;

    public Person() {
    }
    public Person(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "salary=" + salary +
                '}';
    }
}

