package com.qichen.day13;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author qichen
 * @date 2019/10/27
 * @since JDK1.8
 */
/*
    利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出
    最高分，并输出学生成绩等级。
        提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的
            长度。而向量类java.util.Vector可以根据需要动态伸缩。
        创建Vector对象： Vector v=new Vector();
        给向量添加元素： v.addElement(Object obj); //obj必须是对象
        取出向量中的元素： Object obj=v.elementAt(0);
            注意第一个元素的下标是0，返回值是Object类型的。
        计算向量的长度： v.size();
        若与最高分相差10分内： A等； 20分内： B等；
            30分内： C等；其它： D等
 */
public class WrapperExce2 {
    public static void main(String[] args) {
        //1.从键盘读入学生成绩
        Scanner scanner = new Scanner(System.in);
        //2.创建Vector对象
        Vector objects = new Vector();
        //获取最高分
        int max = 0;
        while (true) {
            System.out.print("请输入学生成绩（以负数代表输入结束）：");
            //3.从键盘读入学生成绩
            int i = scanner.nextInt();
            //4.以负数代表输入结束
            if (i < 0) {
                break;
            }
            if (i > 100) {
                System.out.println("输入成绩非法，重新输入：");
                continue;
            }
            if (max < i) {
                max = i;
            }
            //5.给向量添加元素
            objects.addElement(i);
        }
        //遍历Vector，得到每个学生的等级
        char level;
        for (int i = 0; i < objects.size(); i++) {
            Object o = objects.elementAt(i);
            //拆箱
            int score = (int) o;

            if (max - score <= 10) {
                level = 'A';
            } else if (max - score <= 20) {
                level = 'B';
            } else if (max - score <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("student's score is " + score + ", level = " + level);
        }
    }
}
