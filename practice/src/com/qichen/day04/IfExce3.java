package com.qichen.day04;

import java.util.Scanner;

/**
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
/*
    假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入
    一个两位数，然后按照下面的规则判定用户是否能赢。
    1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
    2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
    3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
    4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
    5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
 */
public class IfExce3 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 90 + 10);
        String string = String.valueOf(num);
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入两位数");
        String next = scanner.next();
        if (next.length() != 2) {
            System.out.println("输入不是两位数");
        } else {
            char[] chars1 = next.toCharArray();
            char[] chars2 = string.toCharArray();
            if (next.equals(string)){
                System.out.println("奖金10 000美元");
            }else if (chars1[0]==chars2[1]&&chars1[1]==chars2[0]){
                System.out.println("奖金 3 000美元");
            }else if (chars1[0]==chars2[0]^chars1[1]==chars2[1]){
                System.out.println("奖金1 000美元");
            }else if (chars1[0]==chars2[1]^chars1[1]==chars2[0]) {
                System.out.println("奖金500美元");
            }else {
                System.out.println("彩票作废");
            }

        }
    }
}
