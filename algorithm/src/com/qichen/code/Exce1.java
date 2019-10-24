package com.qichen.code;

/**
 * @author qichen
 * @date 2019/10/22
 * @since JDK1.8
 */
public class Exce1 {
    public static void main(String[] args) {
        int[] arr = {3, 9, 8, 9, 2, 5, 7, 6, 1, 5, 4, 6, 3};
        arraySort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("----------------------------------");
        int i = arraySeek(arr, 10);
        System.out.println(i);
    }

    /**
     * 数组的查找,被查找数组为由小到大
     *
     * @param arr 被查找数组
     * @param num 查找数值
     * @return 索引值
     */
    public static int arraySeek(int[] arr, int num) {
        //超出两极，直接返回-1
        if (num>arr[arr.length-1]||num<arr[0]){
            return -1;
        }
        /*//线性查找
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }*/

        //二分法查找
        /*
            1.比较中央的元素
                若一致，则返回；否则，重新分配，但无需此值
            2.重复以上操作，直到两端交叉

         */
        int start = 0;
        int end = arr.length - 1;
        int mid;
        for (int i = 0; ; i++) {
            mid = (start+end)/2;

            if (num > arr[mid]) {
                start = mid+1;
            }else if (num < arr[mid]){
                end = mid-1;
            }else {
                return mid;
            }
            if (start>end){
                break;
            }
        }
        return -1;
    }

    /**
     * 数值型数组排序，由小到大
     *
     * @param arr
     */
    public static void arraySort(int[] arr) {
        //冒泡法
        /*
            介绍：
                冒泡排序的原理非常简单，它重复地走访过要排序的数列，一次比较两个元
                素，如果他们的顺序错误就把他们交换过来。
            排序思想：
                1. 比较相邻的元素。如果第一个比第二个大（升序），就交换他们两个。
                2. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步
                做完后，最后的元素会是最大的数。
                3. 针对所有的元素重复以上的步骤，除了最后一个。
                4. 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要
                比较为止。
         */

        //外圈循环
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    /*
        数组的反转,
        前提：数组传递的是地址
     */

    /**
     * int型一维数组的反转
     *
     * @param arr
     */
    public static void reverse(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    /*
        数组的复制：new一个新的数组，遍历的同时进行元素复制，以int型一维数组为例
     */

    /**
     * int型一维数组的复制
     *
     * @param arr 原数组
     * @return 复制得到的数组
     */
    public static int[] arrayCopy(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    /**
     * 求数值型数组（一维）中元素的最大值、最小值、平均数、总和等
     *
     * @param arr 数组
     */
    public static void getParam(int[] arr) {
        int max = arr[0];//最大
        int min = arr[0];//最小
        int average;
        int sum = 0;//总和
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("输入数组的最大值为" + max);
        System.out.println("输入数组的最小值为" + min);
        System.out.println("输入数组的总和为" + sum);
        System.out.println("输入数组的平均值为" + sum / arr.length);
    }

    /**
     * 回形数
     * 方法：循环出数，每次+1
     * 判定：
     *
     * @param num 宽度
     */
    public static void huixing(int num) {
        int[][] arr = new int[num][num];
        //计数，也是赋值者
        int count = 1;
        //每转一圈，缩小一圈
        int left = 0;
        int top = 0;
        int right = num - 1;
        int bottom = num - 1;
        label:
        for (; ; ) {
            //水平向左;top,left->right
            for (int i = left; i <= right; i++) {
                arr[top][i] = count++;
            }
            top++;
            //判定
            if (count > num * num) {
                break;
            }
            //垂直向下:right,top->bottom
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = count++;
            }
            right--;
            if (count > num * num) {
                break;
            }
            //水平向右:bottom.right->left
            for (int i = right; i >= left; i--) {
                arr[bottom][i] = count++;
            }
            bottom--;
            if (count > num * num) {
                break;
            }
            //垂直向上:left,bottom->top
            for (int i = bottom; i >= top; i--) {
                arr[i][left] = count++;
            }
            left++;
            if (count > num * num) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 杨辉三角
     *
     * @param rowNum 行数
     */
    public static void yanghui(int rowNum) {
        int[][] arr = new int[rowNum][];
        //遍历每一行
        for (int i = 0; i < arr.length; i++) {
            //初始化每一行，数组长度为列数
            arr[i] = new int[i + 1];
            //每行第一项和最后一项为1
            arr[i][0] = arr[i][i] = 1;
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        //遍历输出
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
