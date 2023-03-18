package com.atguigu.io.buffer;

import org.junit.Test;

import java.io.*;

public class BufferCharTest {
    @Test
    public void test03() throws IOException {
        FileWriter fw = new FileWriter("D:/bw.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("我于杀戮之中绽放");
        bw.newLine();
        bw.write("亦如黎明中的花朵");
        bw.close();
    }

    @Test
    public void test02() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:/bw.txt"));
        String result = "";

        while ((result = br.readLine()) != null) {
            System.out.println(result);
        }
        br.close();
    }
}


