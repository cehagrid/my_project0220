package com.atguigu.generic.g1;

public class Student<T> {
//public class Student<T extends A>{//传入的T类型上限为A类型
//public class Student<T extends A & Comparable>{//传入的泛型满足上一条的同时,必须继承Comparable接口
//    public class Student<T super Person>{//不行
    T name;
    T score;

    public Student() {
    }

    public Student(T name, T score) {
        this.name = name;
        this.score = score;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }


}


