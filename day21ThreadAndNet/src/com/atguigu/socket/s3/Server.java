
package com.atguigu.socket.s3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
双向通信:
客户端可以一直发送,服务器端接受到信息将信息翻转后返回client
 */
public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("----------server----------");
        //1.创建服务器对象
        ServerSocket serverSocket = new ServerSocket(9998);
        //2.获取连接客户端的socket
        Socket accept = serverSocket.accept();
        //3.创建字节缓冲输入流
        InputStream is = accept.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        //4.创建打印流
        PrintStream ps = new PrintStream(accept.getOutputStream());
        //5.循环接收信息
        while (true) {
            //5.1接受信息
            String s = br.readLine();
            //5.2处理信息
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            System.out.println("客户端发来的信息是: "+s);
            System.out.println("反转后的信息是: "+sb);
            //5.3进行反馈
            ps.println(sb.toString());
            if (1 > 2) {
                break;
            }
        }
        //6.关闭资源
        ps.close();
        br.close();


    }
}


