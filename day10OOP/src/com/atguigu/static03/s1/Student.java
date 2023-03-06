package com.atguigu.static03.s1;

public class Student {
    String name;
    int age;
    double score;
    char gender;

    static String Country;

    public Student(String name, int age, double score, char gender) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.gender = gender;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", gender=" + gender +
                '}';
    }
}




















