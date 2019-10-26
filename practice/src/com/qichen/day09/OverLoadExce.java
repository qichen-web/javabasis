package com.qichen.day09;

/**
 * @author qichen
 * @date 2019/10/26
 * @since JDK1.8
 */

public class OverLoadExce {
    public static void main(String[] args) {

    }

    /*
   2. 编写程序，定义三个重载方法并调用。方法名为mOL。
        三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别
        执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
        在主类的main ()方法中分别用参数区别调用三个方法。
     */
    public void mOL(int i) {
        System.out.println(i * i);
    }

    public void mOL(int i, int j) {
        System.out.println(i * j);
    }

    public void mOL(String string) {
        System.out.println(string);
    }

    /*
    定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方
    法求两个double值中的最大值，第三个方法求三个double值中的最大值，
    并分别调用三个方法。
     */
    public int max(int i, int j) {
        return i > j ? i : j;
    }

    public double max(double i, double j) {
        return i > j ? i : j;
    }

    public double max(double i, double j, double k) {
        double temp = max(i, j);
        return temp > k ? temp : k;
    }
}
