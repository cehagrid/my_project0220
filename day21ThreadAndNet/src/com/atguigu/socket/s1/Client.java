package com.atguigu.socket.s1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建客户端对象
        Socket socket = new Socket(InetAddress.getByName("192.168.41.123"),9999);
        //2.获取输出流
        OutputStream os = socket.getOutputStream();
        //3.写出数据
        PrintStream ps = new PrintStream(os);
        ps.println("143332345679403430582738535946859568659");
        //4.关闭流
        ps.close();
        socket.close();
    }
}


