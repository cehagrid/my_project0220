package com.atguigu.net;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    @Test
    public void test01() throws UnknownHostException {
        InetAddress name = InetAddress.getByName("www.z.com");
        System.out.println("name = " + name);

    }
    @Test
    public void test02() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("localHost = " + localHost);

    }
}


