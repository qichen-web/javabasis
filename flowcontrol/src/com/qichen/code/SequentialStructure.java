package com.qichen.code;

/**
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
/*
    Java中定义成员变量时采用合法的前向引用。
 */
public class SequentialStructure {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = num1 + 2;
    }
}
