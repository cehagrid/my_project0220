package com.atguigu.inheritexer;

import java.security.Permission;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.te();

    }
    public void te(){
        Person person = new Person();
        person.setName("Person");
        person.setAge(18);
        person.setGender('男');

        Student student = new Student();
        student.setName("Student");
        student.setAge(19);
        student.setGender('女');
        student.setScore(100);

        Teacher teacher = new Teacher();
        teacher.setName("Teacher");
        teacher.setAge(30);
        teacher.setGender('男');
        teacher.setSalary(10000);

        System.out.println(person.getInfo());
        System.out.println(student.getInfo());
        System.out.println(teacher.getInfo());
    }
}


