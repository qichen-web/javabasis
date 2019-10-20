package com.qichen.code;

/**
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
/*
语法格式
    ①初始化部分
    while(②循环条件部分)｛
    ③循环体部分;
    ④迭代部分;
    }
执行过程：
    ①-②-③-④-②-③-④-②-③-④-...-②
说明：
    注意不要忘记声明④迭代部分。 否则， 循环将不能结束， 变成死循环。
    for循环和while循环可以相互转换
 */
public class WhileCyclic {
    public static void main(String[] args) {
        int result = 0;
        int i = 1;
        while (i <= 100) {
            result += i;
            i++;
        }
        System.out.println("result=" + result);
    }
}
