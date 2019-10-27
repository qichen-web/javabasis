package com.qichen.day13;

import org.junit.Test;

/**
 * @author qichen
 * @date 2019/10/27
 * @since JDK1.8
 */
public class WrapperExce1 {
    public static void main(String[] args) {
//        Object o1 = true ? new Integer(1) : new Double(2.0);
//        System.out.println(o1);
        Object o2;
        if (true) {
            o2 = new Integer(1);
        } else {
            o2 = new Double(2.0);
        }
        System.out.println(o2);
    }

    @Test
    public void method1() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i);
        System.out.println(j);
        System.out.println(i == j);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        //Integer中存在名为IntegerCache的静态类，IntegerCache中定义了Integer[]数组
        //保存了[-128,127]范围的数。自动装箱的数在此范围，可直接使用，不用new。目的，提升效率
        Integer m = 1;
        Integer n = 1;
        System.out.println(m);
        System.out.println(n);
        System.out.println(m == n);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        Integer x = 128;
        Integer y = 128;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x == y);
    }
}
