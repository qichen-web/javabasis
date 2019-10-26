package com.qichen.day09;

import java.io.PrintStream;

/**
 * @author qichen
 * @date 2019/10/26
 * @since JDK1.8
 */
public class ValueTransferExce1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a, b);
        //打印出a=100，b=200
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    //打印完强制退出
    public static void method(int a, int b) {
        System.out.println("a=" + (a * 10));
        System.out.println("b=" + (b * 20));
        System.exit(0);
    }

    //重写println方法
    /*public static void method(int a, int b) {
        PrintStream ps = new PrintStream(System.out) {
            @Override
            public void println(String str) {
                if ("a=10".equals(str)) {
                    str = "a=100";
                } else if ("b=10".equals(str)) {
                    str = "b=200";
                }
                super.println(str);
            }
        };
        System.setOut(ps);
    }*/
}
