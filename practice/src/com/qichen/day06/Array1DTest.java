package com.qichen.day06;

import org.junit.Test;

import java.util.Scanner;

/**
 * 从键盘读入学生成绩，找出最高分，
 * 并输出学生成绩等级。
 * 成绩>=最高分-10 等级为’A’
 * 成绩>=最高分-20 等级为’B’
 * 成绩>=最高分-30 等级为’C’
 * 其余 等级为’D’
 * 提示：先读入学生人数，根据人数创建int数组，
 * 存放学生成绩
 *
 * @author qichen
 * @date 2019/10/22
 * @since JDK1.8
 */

public class Array1DTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int Num = scanner.nextInt();
        int[] arr = new int[Num];
        System.out.println("请输入" + Num + "个成绩：");
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最高分是：" + max);
        for (int i = 0; i < arr.length; i++) {
            int tmp = max - arr[i];
            if (tmp <= 10) {
                System.out.println("Student " + i + " 的成绩是" + arr[i] + ",等级是A");
            } else if (tmp <= 20) {
                System.out.println("Student " + i + " 的成绩是" + arr[i] + ",等级是B");
            } else if (tmp <= 30) {
                System.out.println("Student " + i + " 的成绩是" + arr[i] + ",等级是C");
            } else {
                System.out.println("Student " + i + " 的成绩是" + arr[i] + ",等级是D");
            }
        }

    }
}
