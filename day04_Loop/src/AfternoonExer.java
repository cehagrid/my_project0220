import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class AfternoonExer {
    /*
    输入多个数字，统计整数和负数，读到0时结束
     */
    @Test
    public void test() {
        Scanner scan = new Scanner(System.in);
        int num;
        int positive = 0, negative = 0;
        System.out.println("请输入数字，输入0结束：");
        while ((num = scan.nextInt()) != 0) {
            if (num > 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.println("正数：" + positive);
        System.out.println("负数：" + negative);
    }

    /*
    1-100内输出4的倍数 和 个位数为4的数
     */
    @Test
    public void test1() {
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0 || i % 10 == 4)
                num += i;
        }
        System.out.println("num = " + num);
    }

    /*
    10进制转2进制
     */
    @Test
    public void test2() {
        System.out.println("键盘输入一个正整数：");
        Scanner scan = new Scanner(System.in);
        getBinary(scan.nextInt());
    }

    private void getBinary(int num) {
        if (num < 0) {
            System.out.println("不能为负数！");
            return;
        }
        int count = num;
        String bin = "";
        for (int i = 0; i < count; i++) {
            //除2不为0，余数加到字符串末尾
            if (num >> 1 != 0) {
                bin = (num % 2) + bin;
                num >>= 1;
            }
            //除2为0，余数为1,此时num=1
            else if (num >> 1 == 0 && num % 2 == 1){
                bin = (num % 2) + bin;
                break;
            }
        }
        System.out.println("num to binary is: " + bin);
    }

    /*
    转2进制，使用包装类
     */
    @Test
    public void test2_1(){
        System.out.println("input number：");
        Scanner scan = new Scanner(System.in);
        Integer i = scan.nextInt();
        System.out.println("binary is："+Integer.toString(i,2));
    }

    //输出循环菱形
    /*      raw   space   star  star+space
----*       1      4        1       0
   * *      2      3        2       1
  * * *     3      2        3       2
 * * * *    4      1        4       3
* * * * *   5      0        5       4
-* * * *    1      1        4       3
  * * *     2      2        3
   * *      3      3        2
    *       4      4        1
     */

    @Test
    public void test3(){
        //外层5次循环
        int raw;
        for (raw = 1; raw <= 5; raw++) {
            //1.空格从4递减
            for (int space = 0; space < 5-raw; space++) {
                System.out.print(" ");
            }
            //2.星星+空格
            for (int star = 0; star < raw; star++) {
                System.out.print("* ");
            }
            //3.enter
            System.out.println();
        }
        //外层4次循环
        for (raw = 4; raw >=0; raw--) {
            //1.空格从4递减
            for (int space = 0; space < 5-raw; space++) {
                System.out.print(" ");
            }
            //2.星星+空格
            for (int star = 0; star < raw; star++) {
                System.out.print("* ");
            }
            //3.enter
            System.out.println();
        }
    }
}
