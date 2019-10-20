package com.qichen.code;

/**
 * 位运算符
 *
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
/*
    <<  空位补0，被移除的高位丢弃，空缺位补0。
    >>  被移位的二进制最高位是0，右移后，空缺位补0；最高位是1，空缺位补1。
    >>> 被移位二进制最高位无论是0或者是1，空缺位都用0补。
    &   二进制位进行&运算，只有1&1时结果是1，否则是0;
    |   二进制位进行 | 运算，只有0 | 0时结果是0，否则是1;
    ^   相同二进制位进行 ^ 运算，结果是0； 1^1=0 , 0^0=0   不相同二进制位 ^ 运算结果是1。 1^0=1 , 0^1=1
    ~   正数取反，各二进制码按补码各位取反   负数取反，各二进制码按补码各位取反
 */
public class BitwiseOperators {
    public static void main(String[] args) {
        int i = 21;

        System.out.println("i<<2:" + (i << 2));
        System.out.println("i<<3:" + (i << 3));
        System.out.println("i<<26:" + (i << 26));
        System.out.println("i<<27:" + (i << 27));
        System.out.println("i>>2:" + (i >> 2));
        System.out.println("-8>>2:" + (-8 >> 2));
        System.out.println("-8>>>2:" + (-8 >>> 2));

        int m = 12;
        int n = 5;

        System.out.println("m & n :" + (m & n));
        System.out.println("m / n :" + (m / n));
        System.out.println("m ^ n :" + (m ^ n));

        System.out.println("~ 6 :" + (~ 6));

    }
}
