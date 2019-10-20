package com.qichen.day05;

import org.junit.Test;

/**
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
public class ForTest {
    /*
    1.打印1~100之间所有奇数的和
     */
    @Test
    public void test1() {
        int sum = 0;
        for (int i = 1; i <101 ; i++) {
            if (i%2!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    /*
    2.打印1~100之间所有是7的倍数的整数的个数及总和（体会设置计数器的思想）
     */
    @Test
    public void test2(){
        int count = 0;
        int sum = 0;
        for (int i = 1; i <101 ; i++) {
            if (i%2!=0){
                sum+=i;
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(count);
    }
    /*
    3.输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
        例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
     */
    @Test
    public void test3(){
        for (int i = 100; i <1000 ; i++) {
            int bai = i/100;
            int shi = i%100/10;
            int ge = i%10;
            if (i==(bai*bai*bai+shi*shi*shi+ge*ge*ge)){
                System.out.println(i);
            }
        }
    }
}
