package com.atguigu.exer;

import org.junit.Test;

import java.io.File;

//显示每一个文件夹中的文件
public class FileExer {
    @Test
    public void test(){
        File file = new File("C:\\Users\\Administrator\\Desktop\\来自分享\\day30_JavaScript");
        extracted(file);
    }

    private static void extracted(File file) {
        //传入文件
        //展现列表
        //传入文件
        File[] files = file.listFiles();
        if(file.listFiles() == null){
            return;
        }else{

            for (File file1 : files) {
                extracted(file1);
                System.out.println("file1 = " + file1);
            }
        }
    }

}
