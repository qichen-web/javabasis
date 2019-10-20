package com.qichen.day04;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
public class IfExce2 {
    /**
     * 编写程序，声明2个int型变量并赋值。判断两数之和，如果大于等
     * 于50，打印“hello world!”
     */
    @Test
    public void test1() {
        int n = 10;
        int m = 5;
        if ((m + n) >= 50) {
            System.out.println("hello world!");
        }
    }

    /**
     * 编写程序，声明2个double型变量并赋值。判断第一个数大于10.0，
     * 且第2个数小于20.0，打印两数之和。否则，打印两数的乘积。
     */
    @Test
    public void test2() {
        double m = 10.0;
        double n = 52.1;
        if (m > 10.0 && n < 20.0) {
            System.out.println(m + n);
        } else {
            System.out.println(m * n);
        }
    }

    /**
     * 我家的狗5岁了， 5岁的狗相当于人类多大呢？其实，狗的前两年每
     * 一年相当于人类的10.5岁，之后每增加一年就增加四岁。那么5岁的狗
     * 相当于人类多少年龄呢？应该是： 10.5 + 10.5 + 4 + 4 + 4 = 33岁。
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("狗的年龄：");
        int dogAge = scanner.nextInt();
        double manAge;
        if (dogAge <= 2 && dogAge > 0) {
            manAge = dogAge * 10.5;
        } else if (dogAge > 2) {
            manAge = 1.05 * 2 + (dogAge - 2) * 4;
        } else {
            System.out.println("狗的年龄输入不正确");
            return;
        }
        System.out.println(manAge);
    }
}
