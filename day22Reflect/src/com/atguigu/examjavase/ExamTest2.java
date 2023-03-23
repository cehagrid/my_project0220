package com.atguigu.examjavase;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
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
        while ((len = fir.read(buff)) != -1) {
            osw.write(buff, 0, len);
        }

        osw.close();
        fos.close();
        fir.close();
        fis.close();
    }

    @Test
    public void test06() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100002; i = i + 2) {
            arrayList.add(i);
            linkedList.add(i);
        }
        for (int i = 1; i < 100001; i = i + 2) {
            arrayList.add(i + 1, i + 2);
        }
        long start = System.currentTimeMillis();
        arrayList.get(66666);
        long end = System.currentTimeMillis();
        for (int i = 1; i < 100001; i = i + 2) {
            linkedList.add(i + 1, i + 2);
        }
        System.out.println("ArrayList用时:" + (end - start));
        start = System.currentTimeMillis();
        linkedList.indexOf(66666);
        end = System.currentTimeMillis();

        System.out.println("LinkedList用时:" + (end - start));

//        System.out.println("arrayList = " + arrayList);
//        System.out.println("linkedList = " + linkedList);
    }


    @Test
    public void testaaa() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(111);
        arrayList.add(222);
        arrayList.add(3333);

    }
    @Test
    public void test05(){
//        FileReader reader = new FileReader();
//        reader.read();
        String str = "hello";
        str.length();

    }
}


