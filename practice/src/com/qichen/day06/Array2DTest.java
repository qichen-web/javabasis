package com.qichen.day06;

/**
 * 使用二维数组打印一个 10 行杨辉三角。
 *
 * @author qichen
 * @date 2019/10/22
 * @since JDK1.8
 */

public class Array2DTest {
    public static void main(String[] args) {
        //10行数组存储10行的杨辉三角
        int[][] arr = new int[10][];
        //遍历每一行
        for (int i = 0; i < arr.length; i++) {
            //初始化每一行，数组长度为列数
            arr[i] = new int[i + 1];
            //每行第一项和最后一项为1
            arr[i][0] = arr[i][i] = 1;
            for (int j = 1; j < i ; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        //遍历输出
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
