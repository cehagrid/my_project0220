package com.atguigu.oop;

public class Employee {
    public String name;
   public MyDate birthday = new MyDate();

   private Employee(){

   }

   private static Employee instance = null;
   public static Employee getInstance(){
       if(instance == null){
           instance = new Employee();
       }
       return instance;
   }

}


