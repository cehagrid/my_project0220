package com.atguigu.socket.s3;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/*
双向通信:
客户端可以一直发送,服务器端接受到信息将信息翻转后返回client
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("-----------client-----------");
        //1.创建客户端对象
        Socket socket = new Socket("localhost", 9998);
        //2.键盘输入数据
        Scanner scan = new Scanner(System.in);
        //3.创建打印流写数据
        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);

        //4.创建字符缓冲流读数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //5.循环发送数据
        while (true) {
            //5.1提示语句
            System.out.println("请输入一句话:");
            String message = scan.next();
            //5.2写出数据
            ps.println(message);
            //5.3读取数据
            String s = br.readLine();
            //5.4展示数据
            System.out.println("接收到来自客户端的信息:"+s);
            if (2 > 3) {
                break;
            }
        }
        //6.关流
        br.close();
        ps.close();
    }
}


