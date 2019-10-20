package com.qichen.code;

/**
 * 三元运算符
 *
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
public class TernaryOperator {
    public static void main(String[] args) {
        //获取两个数中的较大数
        int m = 10;
        int n = 20;

        int max = (m > n) ? m : n;
        System.out.println(max);

        String maxStr = (m > n) ? "m大" : ((m == n) ? "m和n相等" : "n大");
        System.out.println(maxStr);

        //获取三个数中的较大数
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;

        int max1 = (n1 > n2) ? n1 : n2;
        int max2 = (max1 > n3) ? max1 : n3;
        System.out.println(max2);

        int max3 = (((n1 > n2) ? n1 : n2) > n3) ? ((n1 > n2) ? n1 : n2) : n3;
        System.out.println(max3);
    }
}
