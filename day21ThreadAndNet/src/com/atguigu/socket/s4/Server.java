package com.atguigu.socket.s4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("---------server----------");
        //1.创建服务端对象
        ServerSocket serverSocket = new ServerSocket(9999);
        //2.获取来自连接的客户端
        int count=0;
        while (true) {
            Socket accept = serverSocket.accept();
            count++;
            System.out.println(accept.getInetAddress()+"来连接了 是第"+count+"个用户");
            SocketThread socketThread = new SocketThread(accept);
            socketThread.start();
        }


    }
}


