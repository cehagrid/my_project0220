package com.atguigu.day11;

import java.util.Scanner;

import static com.atguigu.day11.Gender.FEMALE;
import static com.atguigu.day11.Gender.MALE;

/*
（2）在测试类的main中创建员工数组，并从键盘输入员工对象信息，最后遍历输出
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入员工数量：");
        int count = scanner.nextInt();
        Employee[] employees = new Employee[count];

        //依次输入 name gender age salary phone email
        addEmployee(scanner, employees);


        showEmployee(employees);
    }

    private static void showEmployee(Employee[] employees) {
        System.out.println("员工信息：");
        System.out.println("--------------员工列表----------------");
        System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t工资\t\t电话\t\t\t邮箱\t\t\t");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(i+"\t"+employees[i].getName()+"\t"+employees[i].getGender()
            +"\t"+employees[i].getAge()+"\t"+employees[i].getSalary()+"\t"+employees[i].getPhone()
            +"\t"+employees[i].getEmail());
        }
        System.out.println("--------------员工列表完成----------------");
    }

    private static void addEmployee(Scanner scanner, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
        System.out.println("---------------添加第"+(i+1)+"个员工-----------------");
            System.out.println("please input name:");
            String name = scanner.next();

            System.out.println("please input gender:(MALE or FEMALE)");
            Gender gender = Gender.valueOf(scanner.next());//

            if (!(gender == MALE || gender == FEMALE)) {
                System.out.println("输入错误! 重新输入 ");
//                i--;
                continue;
            }
            System.out.println("please enter age: ");
            int age = scanner.nextInt();
            System.out.println("please enter salary: ");
            int salary = scanner.nextInt();
            System.out.println("please enter phone: ");
            String phone = scanner.next();
            System.out.println("please enter email: ");
            String email = scanner.next();
            employees[i] = new Employee(name,gender,age,salary,phone,email);
            System.out.println("----------------添加完成!-------------------");
        }
    }
}


