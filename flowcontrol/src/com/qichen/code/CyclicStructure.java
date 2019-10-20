package com.qichen.code;

/**
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
/*
    循环结构
        在某些条件满足的情况下，反复执行特定代码的功能
    循环语句分类
        for 循环
        while 循环
        do-while 循环
    循环语句的四个组成部分
        初始化部分(init_statement)
        循环条件部分(test_exp)
        循环体部分(body_statement)
        迭代部分(alter_statement)
 */
/*
         将一个循环放在另一个循环体内，就形成了嵌套循环。其中，
            for ,while ,do…while均可以作为外层循环或内层循环。
         实质上，嵌套循环就是把内层循环当成外层循环的循环体。当只有内层循环的
            循环条件为false时，才会完全跳出内层循环，才可结束外层的当次循环，开
            始下一次的循环。
         设外层循环次数为m次，内层为n次，则内层循环体实际上需要执行m*n次。
*/
public class CyclicStructure {
    public static void main(String[] args) {
        /*
        从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
     */
        /*{
            Scanner scanner = new Scanner(System.in);
            int count1 = 0;
            int count2 = 0;
            for (;;){
                int i = scanner.nextInt();
                if (i>0){
                    count1++;
                }else if (i<0){
                    count2++;
                }else {
                    break;
                }
            }
            System.out.println("+:"+count1);
            System.out.println("-:"+count2);
        }*/
        /*
            1）九九乘法表
        */
        /*{
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i+"*"+j+"="+(i*j)+"\t");
                }
                System.out.println();
            }
        }*/
        /*
            2） 100以内的所有质数
         */
        {
            label:
            for (int i = 2; i <=100 ; i++) {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i%j==0){
                        continue label;
                    }
                }
                System.out.println(i);
            }
        }
    }


}
