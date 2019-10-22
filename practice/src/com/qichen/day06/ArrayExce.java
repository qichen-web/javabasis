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
    public void tset1() {
        int[] arr = new int[6];
        int count = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            label:
            for (; ; ) {
                num = (int) (Math.random() * 29 + 1);
                for (int j = 0; j < count; j++) {
                    if (num == arr[j]) {
                        continue label;
                    }
                }
                break label;
            }
            arr[i] = num;
            count++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
