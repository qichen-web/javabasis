package com.qichen.day03;

/**
 * 交换两个变量的值
 *
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
public class ExchangeOperator {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        System.out.println("m = " + m + " , n = " + n);

        //方法一：通用，利用临时的空变量当做容器，推荐
        /*int temp = m;
        m = n;
        n = temp;
        System.out.println("m = " + m +" , n = " + n);*/

        //方式二：
        //相加操作可能超出范围；仅针对数值型操作
        /*n = m + n;
        m = n - m;
        n = n - m;
        System.out.println("m = " + m +" , n = " + n);*/

        //方法三：使用位运算符：利用概念，重复异或会返回原值 (m ^ n) ^ n = m
        //利用方法二的思想，更改了运算符，适用数值类型，
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println("m = " + m + " , n = " + n);


    }
}
