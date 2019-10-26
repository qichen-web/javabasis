package com.qichen.code2;

import org.junit.Test;

/**
 * @author qichen
 * @date 2019/10/26
 * @since JDK1.8
 */
/*
    递归方法：一个方法体内调用它自身。
    方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执
    行无须循环控制。
    递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死
    循环
 */
public class recursionTest {

    /**
     * 请用Java写出递归求阶乘(n!)的算法
     */
    public static int test1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * test1(n - 1);
        }
    }

    /**
     * 已知有一个数列： f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0
     * 的整数，求f(10)的值。
     */
    public static int test2(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * test2(n - 1) + test2(n - 2);
        }
    }

    /**
     * 已知一个数列： f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
     * 其中n是大于0的整数，求f(10)的值。
     */
    public static int test3(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else if (n > 21) {
            return 2 * test3(n - 1) + test3(n - 2);
        } else {
            return test3(n + 2) - 2 * test3(n + 1);
        }
    }

    /**
     * 输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
     * 1 1 2 3 5 8 13 21 34 55
     * 规律：一个数等于前两个数之和
     * 要求： 计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来
     */
    public static int test4(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return test4(n - 1) + test4(n - 2);
        }
    }

    /**
     * 测试递归调用的次数
     */
    @Test
    public void binormal() {
        recursion(10);
        int test = test(10);
        if (count==test){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    private static int count = 0;

    public static int recursion(int k) {
        count++;
        System.out.println("count1:" + count + "\tk:" + k);
        if (k <= 0) {
            return 0;
        }
//        return recursion(k - 1) + recursion(k - 2);//287
//        return recursion(k - 1);//10->0,11次
//        return recursion(k-2);//10->0,6次
        return recursion(k - 1) + recursion(k - 1);//2048-1->2^11-1
    }

    /**
     * 验证思路，正确
     */
    public static int test(int n) {
        if (n == -1) {
            return 1;
        } else if (n == 0) {
            return 1;
        } else {
            return test(n - 1) + test(n - 2) + 1;
        }
    }
}
