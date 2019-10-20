package com.qichen.day04;

import java.util.Scanner;

/**
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
public class SwitchExce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.使用 switch 把小写类型的 char型转为大写。只转换 a, b, c, d, e. 其它的输出 “other”。
        /*{
            String next = scanner.next();
            if (next.length()!=1){
                System.out.println("");
            }else {
                char c = next.charAt(0);
                switch (c){
                    case 'a':
                        System.out.println('A');
                        break;
                    case 'b':
                        System.out.println('B');
                        break;
                    case 'c':
                        System.out.println('C');
                        break;
                    case 'd':
                        System.out.println('D');
                        break;
                    case 'e':
                        System.out.println('E');
                        break;
                    default:
                        System.out.println("others");
                }
            }
        }*/
        //2.对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格” 。
        /*{
            int i = scanner.nextInt();
            int i1 = i / 60;
            if (i>100){
                System.out.println("成绩错误");
            }
            switch (i1){
                case 0:
                    System.out.println("不合格");
                    break;
                case 1:
                    System.out.println("合格");
                    break;
                    default:
                        System.out.println("成绩错误");
            }
        }*/
        //3.根据用于指定月份，打印该月份所属的季节。
        /*{
            int i = scanner.nextInt();
            switch (i){
                case 3:
                case 4:
                case 5:
                    System.out.println("春季");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("夏季");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("秋季");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("冬季");
                    break;
                default:
                    System.out.println("月份错误");
            }
        }*/
        //4.从键盘上输入2019年的“month”和“day”，要求通过程序
        //输出输入的日期为2019年的第几天。
        {
            System.out.print("month:");
            int month = scanner.nextInt();
            System.out.print("day:");
            int day = scanner.nextInt();

            int sum = 0;

            switch (month) {
                case 12:
                    sum +=  30;
                case 11:
                    sum +=31;
                case 10:
                    sum += 30;
                case 9:
                    sum +=31;
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
                    sum += 28;
                case 2:
                    sum += 31;
                case 1:
                    sum += day;
                    break;
                default:
                    System.out.println("月份错误");
            }
            System.out.println(sum);
        }


    }
}
