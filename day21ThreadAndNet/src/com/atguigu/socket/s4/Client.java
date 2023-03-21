package com.atguigu.socket.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("----------Client----------");
        //1.创建客户对象
        Socket socket = new Socket("localhost", 9999);
        //2.使用打印流写出数据
        PrintStream ps = new PrintStream(socket.getOutputStream());
        //3.写出数据
        ps.println("Hello");
        // 4.创建字符缓冲流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //5.接收数据
        String line = br.readLine();
        //6.展示数据
        System.out.println("服务端反馈的数据 = " + line);
        //7.关闭资源
        br.close();
        ps.close();

    }

}


