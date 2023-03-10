package com.atguigu.exer;

import org.junit.Test;

public class AccountTest {
   @Test
   public void test(){
       Account a1 = new Account(1001,1000);
       System.out.println(a1.getAccount()+"账户有 : " + a1.getBalance()+"rmb");
       a1.add(100);
       a1.add(-100);

   }
}


