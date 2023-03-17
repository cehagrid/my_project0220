package com.atguigu.file02;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.security.PublicKey;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;


public class FileTest {
    @Test
    public void test(){
        File file = new File("C:\\Users\\Administrator\\Desktop\\来自分享\\day30_JavaScript");
        File absoluteFile = file.getAbsoluteFile();
        System.out.println("absoluteFile = " + absoluteFile);

        String filePath = file.getPath();
        System.out.println("filePath = " + filePath);

        System.out.println("file.getName() = " + file.getName());

        System.out.println("file.getParent() = " + file.getParent());

        System.out.println("file.length() = " + file.length());

        System.out.println("file.lastModified() = " + new Date(file.lastModified()));

//  fail      LocalDateTime.session.getCreationTime()/1000;
//  fail      Instant createTime= Instant.ofEpochSecond(session.getCreationTime()/1000);
//  用Date加格式化传入可得到      System.out.println("new LocalDateTime(file.lastModified()) = " + new LocalDateTime(file.lastModified()));

        for (String s : file.list()) {
            System.out.println("s = " + s);
        }

        //过滤文件,满足条件的才会加入数组
        file.listFiles(new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("exe");
            }
        });
    }
    
}


