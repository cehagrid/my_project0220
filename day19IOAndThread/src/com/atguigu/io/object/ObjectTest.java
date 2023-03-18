package com.atguigu.io.object;

import org.junit.Test;

import java.io.*;

public class ObjectTest {
    @Test
    public void test02() throws Exception {
        //1.
        InputStream is = new FileInputStream("D:/oos.txt");
        ObjectInputStream ois = new ObjectInputStream(is);
        //2.
        Student Tom = (Student) ois.readObject();
        Object Jerry = ois.readObject();

        System.out.println(Tom);
        System.out.println("Jerry = " + Jerry);
        //3.关流
        ois.close();
    }

    @Test
    public void test01() throws Exception {
        Student tom = new Student("Tom", 12);
        Student jerry = new Student("Jerry", 23);
        //1.创建对象输出流
        FileOutputStream fis = new FileOutputStream("D:/oos.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fis);
        //2.写入对象
        oos.writeObject(tom);
        oos.writeObject(jerry);
        System.out.println("写入完成");
        //3.关闭
        oos.close();
    }
}


