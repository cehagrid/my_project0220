package com.atguigu.day19;

import org.junit.Test;

import java.io.*;
import java.net.InetSocketAddress;


public class IOHomework01 {
    @Test
    public void test01() throws IOException {
        File dir = new File("D:/testIO");
        dir.mkdir();

        File file = new File("d:/testIO/1.txt");
        file.createNewFile();

    }

    @Test
    public void test02() {
        File file = new File("d:/testIO");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            file.mkdir();
        }

        File[] list = file.listFiles((dir, name) -> name.equals("1.txt"));
        for (File file1 : list) {
            boolean isFile = file1.isFile();
            System.out.println("isFile = " + isFile);
        }

        for (File file1 : list) {
            if (file1.exists()) {

                file1.delete();
                System.out.println("删除成功!");
            }
        }
        if (file.exists()) {
            file.delete();
        }
    }
    @Test

    public void test3(){
        try (FileOutputStream fos = new FileOutputStream("D:/test/1.txt")) {
            byte[] bytes = "ABCDEFGHIJKLMNOPQRSTUVWXYZabc".getBytes();
            fos.write(bytes);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}


