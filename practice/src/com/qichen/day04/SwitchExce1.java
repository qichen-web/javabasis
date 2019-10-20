package com.qichen.day04;

import java.util.Scanner;

/**
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
/*
    从键盘分别输入年、月、日，判断这一天是当年的第几天
 */
public class SwitchExce1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("year：");
        int year = scanner.nextInt();
        System.out.print("month：");
        int month = scanner.nextInt();
        System.out.print("day：");
        int day = scanner.nextInt();
        int sum = 0;

        switch (month) {
            case 12:
                sum += 30;
            case 11:
                sum += 31;
            case 10:
                sum += 30;
            case 9:
                sum += 31;
            case 8:
                sum += 31;
            case 7:
                sum += 30;
            case 6:
                sum += 31;
            case 5:
                sum += 30;
            case 4:
                sum += 31;
            case 3:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    sum += 29;
                } else {
                    sum += 28;
                }
            case 2:
                sum += 31;
            case 1:
                sum += day;
        }
        System.out.print(year + "年" + month + "月" + day + "日是当前第" + sum + "天");
    }
}
