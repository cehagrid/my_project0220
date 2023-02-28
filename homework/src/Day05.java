import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @Description: 数组练习
 * @Title: day05
 * @Package PACKAGE_NAME
 * @Author: liyao@qq.com
 * @Copyright
 * @CreateTime: 2023/2/27 20:41
 */

public class Day05 {
    /*大乐透（前区“35选5”＋后区“12选2”），即前区在1-35之间的号码中随机选取5个，
    后区在1-12之间的号码中随机选取2个，组成一期的中奖号码，请用程序模拟产生一组大
    乐透中奖号码。

    开发提示：

    - 声明一个int类型的数组front，长度为35，默认值都是0；
    - 声明一个int类型的数组after，长度为12，默认值都是0；
    - 随机产生[0,35）之间的整数。如果随机产生的是0，那么就把front[0]修改为1，如果随机
    产生的是5，那么就把front[5]修改为1，如果随机产生的是10，就把front[10]修改为1。
    但是如果本次随机产生的是5，而front[5]已经是1了，那么需要重新随机产生一个整数。
    用这种方式把front数组的5个元素修改为1。
    - 随机产生[0,12）之间的整数。使用同样的方式，把after数组的2个元素修改为1。
    - 遍历front和after数组，输出大乐透中奖号码，判断front和after数组元素是否为1，
    如果为1，就显示它的下标+1值。

     */
    @Test
    public void test() {
        //1.初始化数组
        int front[] = new int[35];
        int after[] = new int[12];
        Random random = new Random();
        //2.随机数的产生
        //count统计已出现号码个数
        int count = 0;
        //3.接受随机数
        int num;
        while (true) {
//        num = (int)(Math.random()*(34-0+1)+0);
            num = random.nextInt(0, 35);
            //先检查是否有重号,有重号重新随机
            if (front[num] == 1){
                continue;
            }else {//没有重号数组置1,count++
                front[num] = 1;
                count++;
            }
            //判断是否满5个数了
            if (count == 5)
                break;
        }
        count = 0;
        //after与之前相同
        while (true) {
//        num = (int)(Math.random()*(34-0+1)+0);
            num = random.nextInt(0, 12);
            //先检查是否有重号,有重号重新随机
            if (after[num] == 1){
                continue;
            }else {//没有重号数组置1,count++
                after[num] = 1;
                count++;
            }
            //判断是否满5个数了
            if (count == 2)
                break;
        }

        //遍历输出
        System.out.print("前5位：");
        for (int index = 0; index < front.length; index++) {
            if (front[index] == 1){
                System.out.print(index+" ");
            }
        }
        System.out.print(" 后2位：");
        for (int index = 0; index < after.length; index++) {
            if (after[index] == 1){
                System.out.print(index+" ");
            }
        }
    }

    /*

     */
    @Test
    public void test2(){

    }
}
