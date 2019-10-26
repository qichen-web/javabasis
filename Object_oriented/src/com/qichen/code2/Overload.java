package com.qichen.code2;

/**
 * @author qichen
 * @date 2019/10/26
 * @since JDK1.8
 */
/*
    重载的概念
        在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数
        类型不同即可。
    重载的特点：
        与返回值类型无关，只看参数列表，且参数列表必须不同。 (参数个数或参数类
        型)。调用时， 根据方法参数列表的不同来区别。

    方法名+参数列表，确定哪个方法
 */
public class Overload {
    public static void main(String[] args) {

    }

    public void getSum(int i, int j) {
        System.out.println("1");
    }

    public void getSum(double i, double j) {
        System.out.println("2");
    }

    public void getSum(int i, String j) {
        System.out.println("3");
    }

    public void getSum(String i, int j) {
        System.out.println("4");
    }
}
