import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;
import java.util.Scanner;

public class MorningExer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入分数：");
        int grade = scan.nextInt();
        int tenDigit = grade / 10;
        String level = "";
        switch (tenDigit){
            case 9:
            case 10:
                level = "A";
                break;
            case 8:
                level = "B";
                break;
            case 7:
                level = "C";
                break;
            case 6:
                level = "D";
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                level = "E";
                break;
        }
        System.out.println(grade+":"+level);


    }

    @Test
    public void myTest1(){
        char[] array = "ABCDEFG".toCharArray();
        System.out.println(array);
        byte[] bytes = "ABCDEFG".getBytes();
        System.out.println(bytes);

    }
}
