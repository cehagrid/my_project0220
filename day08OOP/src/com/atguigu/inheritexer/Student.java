package com.atguigu.inheritexer;

public class Student extends Person{
    private int score;

    public Student() {

    }

    public Student(String name, int age, char gender, int score) {
        super(name, age, gender);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public String getInfo(){
        return super.getInfo()+"\t成绩:"+score;
    }
}


