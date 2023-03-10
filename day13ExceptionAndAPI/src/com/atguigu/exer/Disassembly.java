package com.atguigu.exer;

import org.junit.Test;

//1.使用反汇编,out文件中选择相应的class文件,右键terminal打开
//2.输入命令javap -c (Tab键)
public class Disassembly {
    @Test
    public void test(){
        int y = 1;
        y = y+++1;
        System.out.println(y);
    }
}


