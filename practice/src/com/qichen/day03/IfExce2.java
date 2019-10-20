package com.qichen.day03;

import java.util.Scanner;

/**
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
/*
    编写程序：由键盘输入三个整数分别存入变量num1、 num2、 num3，对它们进行排序(使用 if-else if-else),并且从小到大输出。
 */
public class IfExce2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入num1的值：");
        int num1 = scanner.nextInt();
        System.out.print("请输入num2的值：");
        int num2 = scanner.nextInt();
        System.out.print("请输入num3的值：");
        int num3 = scanner.nextInt();

        int temp;
        //num1 和 num2 比较
        if (num1 >= num2) {
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        //num1 和 num3 比较
        if (num1 >= num3) {
            temp = num3;
            num3 = num1;
            num1 = temp;
        }
        //num3 和 num2 比较
        if (num2 >= num3) {
            temp = num3;
            num3 = num2;
            num2 = temp;
        }


        System.out.println(num1+","+num2+","+num3);

    }
}
