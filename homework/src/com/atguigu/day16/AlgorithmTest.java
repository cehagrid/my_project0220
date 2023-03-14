package com.atguigu.day16;

import org.junit.Test;

import java.util.Arrays;
import java.util.ResourceBundle;

/*
给你两个非负整数数组rowSum 和colSum，其中rowSum[i]是二维矩阵中第 i行元素的和，
colSum[j]是第 j列元素的和。换言之你不知道矩阵里的每个元素，但是你知道每一行和每一列的和。

请找到大小为rowSum.length x colSum.length的任意 非负整数矩阵，且该矩阵满足rowSum
和colSum的要求。

请你返回任意一个满足题目要求的二维矩阵，题目保证存在 至少一个可行矩阵。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/find-valid-matrix-given-row-and-column-sums
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 */
public class AlgorithmTest {
    /*
    输入：rowSum = [3,8], colSum = [4,7]
输出：[[3,0],
      [1,7]]
解释：
第 0 行：3 + 0 = 3 == rowSum[0]
第 1 行：1 + 7 = 8 == rowSum[1]
第 0 列：3 + 1 = 4 == colSum[0]
第 1 列：0 + 7 = 7 == colSum[1]
行和列的和都满足题目要求，且所有矩阵元素都是非负的。
另一个可行的矩阵为：[[1,2],
                  [3,5]]

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/find-valid-matrix-given-row-and-column-sums
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    @Test
    public void test(){
        int[] rowSum = {3,8};
        int[] colSum = {4,7};
        for (int i = 0; i < rowSum.length; i++) {
            System.out.println(rowSum[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < colSum.length; i++) {
            System.out.print(colSum[i]+" ");
        }
        System.out.println();
        System.out.println();
        int[][] ints = Solution.restoreMatrix(rowSum, colSum);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
//        //先求输入的数组长度
//        int m = rowSum.length;
//        int n = colSum.length;
//        //定义数组
//        int[][] res = new int[m][n];
//        //遍历输入数组
//        //输入:1.先对比两个数组最小值填入二维数组1号位,其余位置填0,忽视此行或列
//        for (int i = 0; i < m; i++) {
//
//            int temp = colSum[i] > rowSum[i] ? rowSum[i] : colSum[i];
//            res[0][0] = temp;
//            //如果是行小,列填0
//            if(colSum[i] > rowSum[i]){
//                for (int j = 1; j < n - 1; j++) {
//                    res[0][j] = 0;
//                }
//                colSum[0]=colSum[0]-temp;
//            }else{
//
//                //如果列小,行填0
//                for (int j = 0; j < m - 1; j++) {
//                    res[0][j] = 0;
//                }
//                rowSum[0]=rowSum[0]-temp;
//            }
//
//            //
//
//            for (int j = 0; j < n; j++) {
//                res[i][j] = rowSum[i] + colSum[j];
//            }
//        }
//        //返回结果
//        return res;
/*
方法一：贪心 + 构造
我们可以先初始化一个 mm 行 nn 列的答案矩阵 ansans。
接下来，遍历矩阵的每一个位置 (i, j)(i,j)，将该位置的元素
设为 x = min(rowSum[i], colSum[j])x=min(rowSum[i],colSum[j])，
并将 rowSum[i]rowSum[i] 和 colSum[j]colSum[j] 分别减去 xx。
遍历完所有的位置后，我们就可以得到一个满足题目要求的矩阵 ansans。
以上策略的正确性说明如下：
根据题目的要求，我们知道 rowSumrowSum 和 colSumcolSum 的和是相等的，
那么 rowSum[0]rowSum[0] 一定小于等于 \sum_{j = 0}^{n - 1} colSum[j]∑
j=0
n−1

 colSum[j]。所以，在经过 nn 次操作后，一定能够使得 rowSum[0]rowSum[0] 为
  00，并且保证对任意 j \in [0, n - 1]j∈[0,n−1]，都有 colSum[j] \geq 0colSum[j]≥0。

因此，我们把原问题缩小为一个 m-1m−1 行和 nn 列的子问题，继续进行上述的操作，
直到 rowSumrowSum 和 colSumcolSum 中的所有元素都为 00，就可以得到一个满足题目要求的矩阵 ansans。

作者：lcbin
链接：https://leetcode.cn/problems/find-valid-matrix-given-row-and-column-sums/solution/python3javacgotypescript-yi-ti-yi-jie-ta-qtx7/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
//        int m = rowSum.length;
//        int n = colSum.length;
//        int[][] ans = new int[m][n];
//        for (int i = 0; i < m; ++i) {
//            for (int j = 0; j < n; ++j) {
//                int x = Math.min(rowSum[i], colSum[j]);
//                ans[i][j] = x;
//                rowSum[i] -= x;
//                colSum[j] -= x;
//            }
//        }
//        return ans;

        int m = rowSum.length;
        int n = colSum.length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; ++i) {//行
            for (int j = 0; j < n; ++j) {//列
                ans[i][j] = Math.min(rowSum[i], colSum[j]);
                rowSum[i] -= ans[i][j];
                colSum[j] -= ans[i][j];
            }
        }
        return ans;
    }
}

