package com.atguigu.examjavase;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

public class ExamTest2 {
    @Test
    public void test01() throws IOException {
        Properties properties = new Properties();
//        FileInputStream fis = new FileInputStream("info.properties");
//        properties.load(fis);
        properties.load(ClassLoader.getSystemResourceAsStream("info.properties"));
    }

    @Test
    public void test02() throws IOException {
        FileInputStream fis = new FileInputStream("info.properties");
        InputStreamReader fir = new InputStreamReader(fis, "GBK");

        FileOutputStream fos = new FileOutputStream("info.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");

        char[] buff = new char[20];
        int len;
        while ((len = fir.read(buff))!=-1){
            osw.write(buff, 0, len);
        }

        osw.close();
        fos.close();
        fir.close();
        fis.close();
    }
}


