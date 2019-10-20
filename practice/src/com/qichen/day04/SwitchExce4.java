package com.qichen.day04;

import java.util.Scanner;

/**
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
/*
    编写一个程序，为一个给定的年份找出其对应的中国生肖。中国的生肖基于12年一个周期，
    每年用一个动物代表： rat、 ox、 tiger、 rabbit、 dragon、 snake、 horse、 sheep、 monkey、
    rooster、 dog、 pig。
 */
public class SwitchExce4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入年份");
        int year = scanner.nextInt();

        int i = year % 12;
        switch (i) {
            case 0:
                System.out.println("pig");
                break;
            case 1:
                System.out.println("rat");
                break;
            case 2:
                System.out.println("ox");
                break;
            case 3:
                System.out.println("tiger");
                break;
            case 4:
                System.out.println("rabbit");
                break;
            case 5:
                System.out.println("dragon");
                break;
            case 6:
                System.out.println("snake");
                break;
            case 7:
                System.out.println("horse");
                break;
            case 8:
                System.out.println("sheep");
                break;
            case 9:
                System.out.println("monkey");
                break;
            case 10:
                System.out.println("rooster");
                break;
            case 11:
                System.out.println("dog");
                break;
            default:

        }
    }
}
