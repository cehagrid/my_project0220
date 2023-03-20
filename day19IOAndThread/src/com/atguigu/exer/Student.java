package com.atguigu.exer;

import java.io.Serializable;

public class Student implements Serializable {
        public String name;
        public transient int age;//瞬时的
        public char gender;
        public volatile double salary;//

       public Student() {
       }

       public Student(String name, int age, char gender, double salary) {
           this.name = name;
           this.age = age;
           this.gender = gender;
           this.salary = salary;
       }

       public String show() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    ", salary=" + salary +
                    '}';
        }
    }