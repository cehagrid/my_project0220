package com.atguigu.io.object;

import org.junit.Test;
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class ExerTest {
    @Test
    public void test02() throws Exception {
        //1.
        FileInputStream fis = new FileInputStream("D:/set.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        //2.
        Set set = (Set)ois.readObject();
        for (Object o : set) {
            System.out.println(o);
        }
        //3.
        ois.close();

    }

    @Test
    public void test01() throws Exception {
        Student s1 = new Student("烬", 23);
        Student s2 = new Student("莱西奥", 22);
        Student s3 = new Student("澜", 20);
        HashSet<Student> set = new HashSet<>();

        set.add(s1);
        set.add(s2);
        set.add(s3);

        //1.
        FileOutputStream fos = new FileOutputStream("D:/set.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //2.
        oos.writeObject(set);

        //3.
        System.out.println("输入完成");
        oos.close();

    }
}


