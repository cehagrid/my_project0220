package com.atguigu.exer;

public class Student implements Cloneable,Comparable{
    protected  Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    String name;
    int age;
    double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {

            Student student = (Student) o;
            return this.age - student.age;
    }


}


