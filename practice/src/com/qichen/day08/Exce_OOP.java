package com.qichen.day08;

/**
 * @author qichen
 * @date 2019/10/25
 * @since JDK1.8
 */

/*
    3.1 编写程序， 声明一个method方法， 在方法中打印一个10*8 的*型矩形，
    在main方法中调用该方法。
    3.2 修改上一个程序， 在method方法中， 除打印一个10*8的*型矩形外， 再
    计算该矩形的面积， 并将其作为方法返回值。 在main方法中调用该方法，
    接收返回的面积值并打印。
    3.3 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个
    m*n的*型矩形，并计算该矩形的面积， 将其作为方法返回值。在main方法
    中调用该方法，接收返回的面积值并打印。

 */
public class Exce_OOP {
    public static void main(String[] args) {
        Exce_OOP e1 = new Exce_OOP();
        e1.method1();
        System.out.println("////////////////////////////////////////////");

        System.out.println(e1.method2());
        System.out.println("////////////////////////////////////////////");

        System.out.println(e1.method3(12, 10));

    }

    /**
     * 打印一个10*8 的*型矩形
     */
    private void method1() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    /**
     * 打印一个10*8的*型矩形外， 再
     * 计算该矩形的面积， 并将其作为方法返回值
     *
     * @return 该矩形的面积
     */
    private int method2() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        return 10 * 8;
    }

    /**
     * 打印一个
     * m*n的*型矩形，并计算该矩形的面积， 将其作为方法返回值
     *
     * @param m
     * @param n
     * @return 该矩形的面积
     */
    private int method3(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        return m * n;
    }


}
