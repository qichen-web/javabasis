package com.qichen.code;

/**
 * @author qichen
 * @Date 2019/10/19
 * @since JDK1.8
 */
/*
    引用数据类型
        类
            字符串（String）
                 String不是基本数据类型，属于引用数据类型
                 使用方式与基本数据类型一致。例如： String str = “abcd”;
                 一个字符串可以串接另一个字符串，也可以直接串接其他类型的数据。
        接口
        数组
 */
public class ReferenceType {
    public static void main(String[] args) {
        int no = 10;
        String str = "abcdef";
        String str1 = str + "xyz" + no;

        str1 = str1 + "123";
        char c = '国';

        double pi = 3.1416;
        str1 = str1 + pi;
        boolean b = false;
        str1 = str1 + b;
        str1 = str1 + c;

        System.out.println("str1 = " + str1);
    }
}
