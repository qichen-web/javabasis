package com.qichen.code;

import java.util.Arrays;

/**
 * @author qichen
 * @date 2019/10/24
 * @since JDK1.8
 */
public class AttaysTool {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[]{1,2,3,4,5,6,7,8,9};
        int[] arr3 = new int[]{4,8,2,6,7,3,1,9,5};

        //判断两个数组是否相等。
        boolean equals = Arrays.equals(arr1, arr2);
        System.out.println(equals);

        //输出数组信息。
        String string = Arrays.toString(arr1);
        System.out.println(string);

        //将指定值填充到数组之中
        Arrays.fill(arr1,5);
        System.out.println(Arrays.toString(arr1));

        //对数组进行排序。
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        //对排序后的数组进行二分法检索指定的值。
        int i = Arrays.binarySearch(arr3, 5);
        System.out.println(i);
    }
}
