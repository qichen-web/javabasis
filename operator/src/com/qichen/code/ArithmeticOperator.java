package com.qichen.code;

/**
 * @author qichen
 * @Date 2019/10/19
 * @since JDK1.8
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        //  +
        int a = 3;
        int b = 2;
        System.out.println(a+b);
        System.out.println(b+a);
        //  -
        System.out.println(a-b);
        System.out.println(b-a);
        //  *
        System.out.println(a*b);
        System.out.println(b*a);
        //  /
        System.out.println(a/b);
        System.out.println(a/b+0.0);
        System.out.println((double)(a/b));
        System.out.println((a+0.0)/b);
        System.out.println((double) a/b);
        //  %
        System.out.println(a%b);
        //不会自动提升数据类型
        //  ++(前)
        //  ++(后)
        //  --(前)
        //  --(后)
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.print("i="+i);
        System.out.println("i1="+i1);
        i = ++i1;
        System.out.print("i="+i);
        System.out.println("i1="+i1);
        i = i2--;
        System.out.print("i="+i);
        System.out.println("i2="+i2);
        i = --i2;
        System.out.print("i="+i);
        System.out.println("i2="+i2);
    }
}
