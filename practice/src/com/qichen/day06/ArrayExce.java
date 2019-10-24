package com.qichen.day06;

import org.junit.Test;

/**
 * @author qichen
 * @date 2019/10/22
 * @since JDK1.8
 */
public class ArrayExce {
    /**
     * 创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。同时，要求
     * 元素的值各不相同。
     */
    @Test
    public void test1() {
        //初始化数组
        int[] arr = new int[6];
        //统计已填充数组的长度
        int count = 0;
        int num;
        //数组赋值遍历
        for (int i = 0; i < arr.length; i++) {
            //无限循环，不知道随机的次数
            label:
            for (; ; ) {
                //随机生成1-30的数
                num = (int) (Math.random() * 29 + 1);
                //遍历以填充部分
                for (int j = 0; j < count; j++) {
                    //比较新的随机数和数组中已有元素的值
                    if (num == arr[j]) {
                        //存在相同则直接重新随机生成数字，跳过循环
                        continue label;
                    }
                }
                //没有重复，赋值，计数
                break label;
            }
            arr[i] = num;
            count++;
        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void test2() {
        //初始化数组
        int[] arr = new int[6];
        //统计已填充数组的长度
        int num;
        //数组赋值遍历
        label:
        for (int i = 0; i < arr.length; i++) {
            //随机数生成
            num = (int) (Math.random() * 29 + 1);
            //查询重复
            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    //重复后退回，重来
                    i--;
                    continue label;
                }
            }
            //不重复，赋值
            arr[i] = num;
        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
