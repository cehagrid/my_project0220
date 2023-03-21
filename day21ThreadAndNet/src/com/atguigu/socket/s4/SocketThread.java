package com.atguigu.socket.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class SocketThread extends Thread {
    private Socket socket;
    public SocketThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //1.获取客户端发来的信息
        //2.创建字符缓冲输入流对象

        try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintStream ps = new PrintStream(socket.getOutputStream());
        ) {

            //3.读取数据
            String s = br.readLine();
            //4.数据反转
            StringBuffer buffer = new StringBuffer(s);
            StringBuffer reverse = buffer.reverse();
            //5.展示数据
            System.out.println("客户端发来的数据:"+s+",反转后的数据:"+reverse);

            //6.反馈数
            ps.println(reverse.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}


