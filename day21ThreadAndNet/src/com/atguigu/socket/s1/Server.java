package com.atguigu.socket.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.创建服务端对象
        ServerSocket serverSocket = new ServerSocket(9999);
        //2.获取来连接的客户端对象
        Socket socket = serverSocket.accept();
        //3.获取输入流接受信息
        InputStream is = socket.getInputStream();
        //3.1字节流 -> 字符流
        InputStreamReader isr = new InputStreamReader(is);
        //3.2
        BufferedReader br = new BufferedReader(isr);
        //4.读取字符
        String s = br.readLine();
        System.out.println("客户发来的信息:"+s);
    }
}


