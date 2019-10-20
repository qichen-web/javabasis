package com.qichen.day04;

import java.util.Scanner;

/**
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
/*
    大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出
    一定的条件：高： 180cm以上；富：财富1千万以上；帅：是。
     如果这三个条件同时满足，则：“我一定要嫁给他!!!”
     如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
     如果三个条件都不满足，则：“不嫁！”
 */
public class IfExce4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("身高：(cm)");
        int height = scanner.nextInt();
        System.out.print("财富：(千万)");
        double wealth = scanner.nextDouble();
        System.out.print("帅否：(true/false)");
        boolean headsome = scanner.nextBoolean();
        if (height > 180 && wealth > 1.0 && headsome) {
            System.out.println("我一定要嫁给他!!!");
        }else if (height > 180 || wealth > 1.0 || headsome){
            System.out.println("嫁吧，比上不足，比下有余。");
        }else {
            System.out.println("不嫁！");
        }
    }
}
