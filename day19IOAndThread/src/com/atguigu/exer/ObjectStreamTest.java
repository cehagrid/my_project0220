package com.atguigu.exer;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.*;

public class ObjectStreamTest {
    @Test
    public void test01() {

        Student s1 = new Student("Tom", 23, 'M', 30000.1);
        try (OutputStream os = new FileOutputStream("D:/osoos.txt");
             ObjectOutputStream oos = new ObjectOutputStream(os);
        ) {
            oos.writeObject(s1);
            System.out.println("输出对象完成");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void test02() {
        try (
                FileInputStream fis = new FileInputStream("D:/osoos.txt");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            Student o = (Student) ois.readObject();
            String show = o.show();
            System.out.println(show);
//IOUtils.copy(fis,ois);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}


