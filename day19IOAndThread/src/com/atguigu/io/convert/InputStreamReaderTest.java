package com.atguigu.io.convert;

import org.junit.Test;

import java.io.*;

public class InputStreamReaderTest {
    //Scanner的功能
    @Test
    public void test03() throws IOException {
        System.out.println("请输入一句话:");
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is, "utf-8");
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        System.out.println("line = " + line);

    }

    @Test
    public void test02() throws IOException {
        InputStream is = new FileInputStream("D:/a.txt");
        InputStreamReader isr = new InputStreamReader(is, "gbk");
        int read = isr.read();
        System.out.println("read: " + read+"--->"+(char)read);

    }

    @Test
    public void test01() throws IOException {
        Reader fr = new FileReader("D:/a.txt");

        int read = fr.read();

        System.out.println("read: " + read+"--->"+(char)read);

        fr.close();
    }
}


