package com.qichen.code;

/**
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
/*
语法格式
    ①初始化部分;
    do{
    ③循环体部分
    ④迭代部分
    }while(②循环条件部分);
执行过程：
    ①-③-④-②-③-④-②-③-④-...②
说明：
    do-while循环至少执行一次循环体。
 */
public class DoWhileCyclic {
    public static void main(String[] args) {
        int result = 0, i = 1;
        do {
            result += i;
            i++;
        } while (i <= 100);
        System.out.println("result=" + result);
    }

}
