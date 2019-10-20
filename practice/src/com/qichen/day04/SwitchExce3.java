package com.qichen.day04;

import java.util.Scanner;

/**
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
/*
从键盘上读入一个学生成绩，存放在变量score中，根据score的
值输出其对应的成绩等级：
    score>=90       等级: A
    70<=score<90    等级: B
    60<=score<70    等级: C
    score<60        等级: D
方式一：使用if-else
方式二：使用switch-case: score / 10: 0 - 10
 */
public class SwitchExce3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入成绩");
        int score = scanner.nextInt();
        int i = score / 10;

        switch (i) {
            case 10:
            case 9:
                System.out.println('A');
                break;
            case 8:
            case 7:
                System.out.println('B');
                break;
            case 6:
                System.out.println('C');
                break;
            default:
                System.out.println('D');

        }

    }
}
