import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Day03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入字符：");
        String string = scan.nextLine();
        char ch = string.charAt(0);
        System.out.println((int) ch);
        if (48 <= ch && ch <= 57) {
            System.out.println("0-9");
        } else if (65 <= ch && ch <= 90 || 97 <= ch && ch <= 122) {
            System.out.println("a-z | A-Z");
        } else {
            System.out.println("其他");
        }
    }

    @Test
    public void test1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入字符：");
        String string = scan.next();
        char ch = string.charAt(0);
        if (48 <= ch && ch <= 57) {
            System.out.println("0-9");
        } else if (65 <= ch && 90 >= ch || 97 <= ch && ch <= 122) {
            System.out.println("a-z | A-Z");
        } else {
            System.out.println("其他");
        }
    }

    @Test
    public void test2(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022,12,31);
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);
        System.out.println("----------------------");
        calendar.getTimeInMillis();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String currSun = sdf.format(date);
        System.out.println(currSun);
    }
    @Test
    public void test3(){
        System.out.println("123");
        System.out.println("master-");
        System.out.println("master-test1");
        System.out.println("push-test");
    }
}
