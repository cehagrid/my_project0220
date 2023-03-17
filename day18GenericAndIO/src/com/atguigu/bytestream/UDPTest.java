package com.atguigu.bytestream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPTest {
    @Test
    public void sender() throws IOException {

        DatagramSocket socket = new DatagramSocket();

//        String str = "我是UDP方式发送的导弹";
        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\2a.jpg");
        int len=0;
        byte[] buff = new byte[20];
        String str = "" ;
        while ((len = fis.read(buff)) != -1) {
            str+=new String(buff,0,len);
        }
        byte[] data = str.getBytes();
//        InetAddress inet = InetAddress.getLocalHost();
        DatagramPacket packet = new DatagramPacket(data, 0, data.length, InetAddress.getByName("192.168.41.56"), 9090);
        socket.send(packet);
        socket.close();

    }

    @Test
    public void receiver() throws IOException {

        DatagramSocket socket = new DatagramSocket(9090);

        byte[] buffer = new byte[1024*100];
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);

        socket.receive(packet);
        byte[] data = packet.getData();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\2a.jpg");
//        System.out.println(new String(packet.getData(),0,packet.getLength()));
        int len = data.length;
        fos.write(data,0,len);
        fos.close();
        socket.close();

    }
}


