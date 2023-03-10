package com.atguigu.exer;

public class Account {
    private int account;
    private double balance;

    public Account() {
    }

    public Account(int account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public int getAccount() {
        return account;
    }

    private void setAccount(int account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

   public void add(double money) {
       if (money < 0) {
           throw new IllegalArgumentException("存款金额有误!");
       }
       System.out.println("存款前余额:"+getBalance());
       setBalance(getBalance() + money);
       System.out.println("当前余额:"+getBalance());
    }
    public void sub(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("取款金额有误!");
        }
        System.out.println("取款前余额:"+getBalance());
        setBalance(getBalance() - money);
        System.out.println("当前余额:"+getBalance());
    }
}


