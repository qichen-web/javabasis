package com.qichen.code2;

/**
 * @author qichen
 * @date 2019/10/25
 * @since JDK1.8
 */
public class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arr = new int[]{32, 3, 6, 5, 48, 1, 8, -5, -43, -78};
        int max = arrayUtil.getMax(arr);
        System.out.println("最大值为：" + max);

        System.out.println("排序前");
        arrayUtil.print(arr);

        arrayUtil.sort(arr);

        System.out.println("排序后");
        arrayUtil.print(arr);

    }
}
