package com.atguigu.getclass.sort;

import java.util.Objects;

public class Student implements Comparable {
    String name;
    int age;
    int score;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && score == student.score && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student student = (Student) o;
            if (this.age > student.age) {
                return 1;
            } else if (this.age < student.age) {
                return -1;
            }else {
                return 0;
            }
        }
        throw new IllegalArgumentException("传入数据类型不一致");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}


