package com.qichen.code;

import java.util.Scanner;

/**
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
/*
 语法格式
    for (①初始化部分; ②循环条件部分; ④迭代部分)｛
    ③循环体部分;｝
 执行过程：
    ①-②-③-④-②-③-④-②-③-④-.....-②
 说明：
     ②循环条件部分为boolean类型表达式，当值为false时，退出循环
     ①初始化部分可以声明多个变量，但必须是同一个类型，用逗号分隔
     ④可以有多个变量更新，用逗号分隔
 */
public class ForCyclic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*{
            int result = 0;
            for (int i = 1; i <= 100; i++) {
                result += i;
            }
            System.out.println("result=" + result);
        }*/
        /*
            编写程序从1循环到150，并在每行打印一个值，另外在每个3的倍数行
            上打印出“foo”,在每个5的倍数行上打印“biz”,在每个7的倍数行上打印
            输出“baz”。
         */
        /*{
            for (int i = 0; i < 150; i++) {
                int sum = i+1;
                System.out.print(sum+"\t");
                if (sum%3==0){
                    System.out.print("foo\t");
                }
                if (sum%5 ==0){
                    System.out.print("biz\t");
                }
                if (sum%7==0){
                    System.out.print("bax\t");
                }
                System.out.println("");
            }
        }*/
        /*
            题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
            比如： 12和20的最大公约数是4，最小公倍数是60。
         */
        {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            if (m == n) {
                System.out.println("最大公约数和最小公倍数均为：" + m);
            }
            int max = (m > n) ? m : n;
            int min = (m < n) ? m : n;
            //最大公约数
            for (int i = min; i > 0; i--) {
                if (max % i == 0 && min % i == 0) {
                    System.out.println("最大公约数：" + i);
                    break;
                }
            }
            //最小公倍数
            for (int i = max; ; i++) {
                if (i%max==0&&i%min==0){
                    System.out.println("最小公倍数："+i);
                    break;
                }
            }
        }
    }
}
