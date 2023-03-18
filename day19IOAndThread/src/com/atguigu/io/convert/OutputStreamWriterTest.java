package com.atguigu.io.convert;

import org.junit.Test;

import java.io.*;

public class OutputStreamWriterTest {


    @Test
    public void test03() throws IOException {
      //  System.out.println("ABC");
        PrintStream out = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(out);

        osw.write("ABC");
        System.out.println("输出完成!");
        osw.close();

    }



    @Test
    public void test02() throws Exception {
        //todo 使用gbk编码 存储文件信息
        //1.创建字节输出流
        FileOutputStream fos = new FileOutputStream("D:/wb.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        osw.write("ssss");
        osw.close();
    }

    @Test
    public void test01() throws IOException {

        //1.创建字符输出流
        Writer writer = new FileWriter("D:/ww.txt");

        //2.写出数据
        writer.write("我不困 我爱学习 ");

        //3.关闭资源
        writer.close();



    }
}
