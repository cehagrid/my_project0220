package com.atguigu.constructor;

public class Person {
    private String name;
    private double salary;
    private int age;
    private char gender;

     Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Person(String name, double salary, int age, char gender) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        System.out.println("Person 无参");
    }

    private Person(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
