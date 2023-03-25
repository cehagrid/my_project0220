package com.atguigu.morning.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeTest {
    private static int compare(Employee o1, Employee o2) {
        return o1.getSalary() > o2.getSalary() ? 1 : -1;
    }

    private static int compare2(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }

    @Test
    public void test01(){

        ArrayList<Employee> list = new ArrayList<Employee>();
        Employee e1 = new Employee("王朝", 23, 9888.1);
        Employee e2 = new Employee("马汉", 24, 9988.3);
        Employee e3 = new Employee("张龙", 21, 9888.8);
        Employee e4 = new Employee("赵虎", 18, 9888.7);
        Collections.addAll(list, e1,e2,e3,e4);
        //遍历
        list.forEach(System.out::println);
        /*
sort
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() > o2.getSalary()?1:-1;
            }
        });
*/
//        Collections.sort(list, (o1, o2) -> o1.getSalary() > o2.getSalary()?1:-1);
        System.out.println("----------------------");
        Collections.sort(list, EmployeeTest::compare);
        list.forEach(System.out::println);

//        Collections.sort(list,new Comparator<Employee>(){
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        System.out.println("----------------------");
//        Collections.sort(list,(o1, o2)-> o1.getAge()-o2.getAge());
        Collections.sort(list, EmployeeTest::compare2);
        list.forEach(System.out::println);


    }
}


