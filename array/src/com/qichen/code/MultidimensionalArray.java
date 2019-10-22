package com.qichen.code;

/**
 * @author qichen
 * @date 2019/10/22
 * @since JDK1.8
 */
/*
     Java 语言里提供了支持多维数组的语法。
     如果说可以把一维数组当成几何中的线性图形，
        那么二维数组就相当于是一个表格。
     对于二维数组的理解，我们可以看成是一维数组
        array1又作为另一个一维数组array2的元素而存
        在。其实， 从数组底层的运行机制来看，其实没
        有多维数组。
     注意特殊写法情况： int[] x,y[]; x是一维数组， y是二维数组。
     Java中多维数组不必都是规则矩阵形式
 */
public class MultidimensionalArray {
    public static void main(String[] args) {
        /*
            二维数组的初始化
         */
        /*
        格式1（动态初始化） ： int[][] arr = new int[3][2];
        定义了名称为arr的二维数组
        二维数组中有3个一维数组
        每一个一维数组中有2个元素
        一维数组的名称分别为arr[0], arr[1], arr[2]
        给第一个一维数组1脚标位赋值为78写法是： arr[0][1] = 78;
         */
        int[][] arr = new int[3][2];
        int[] arr3[] = new int[3][2];
        /*
        格式2（动态初始化） ： int[][] arr = new int[3][];
        二维数组中有3个一维数组。
        每个一维数组都是默认初始化值null (注意：区别于格式1）
        可以对这个三个一维数组分别进行初始化
        arr[0] = new int[3]; arr[1] = new int[1]; arr[2] = new int[2];
        注：int[][]arr = new int[][3]; //非法
         */
        int[][] arr1 = new int[3][];
        arr1[0] = new int[3];
        arr1[1] = new int[2];
        arr1[2] = new int[1];
        /*
        格式3（静态初始化） ： int[][] arr = new int[][]{{3,8,2},{2,7},{9,0,1,6}};
        定义一个名称为arr的二维数组，二维数组中有三个一维数组
        每一个一维数组中具体元素也都已初始化
        第一个一维数组 arr[0] = {3,8,2};
        第二个一维数组 arr[1] = {2,7};
        第三个一维数组 arr[2] = {9,0,1,6};
        第三个一维数组的长度表示方式： arr[2].length;
         */
        int[][] arr2 = new int[][]{{3,8,2},{2,7},{9,0,1,6}};
    }
}
