package com.qichen.code;

/**
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
/*
    数组(Array)， 是多个相同类型数据按一定顺序排列
    的集合， 并使用一个名字命名， 并通过编号的方式
    对这些数据进行统一管理。

     数组的常见概念
         数组名
         下标(或索引)
         元素
         数组的长度

 */
/*
     数组本身是引用数据类型， 而数组中的元素可以是任何数据类型， 包括
        基本数据类型和引用数据类型。
     创建数组对象会在内存中开辟一整块连续的空间， 而数组名中引用的是
        这块连续空间的首地址。
     数组的长度一旦确定， 就不能修改。
     我们可以直接通过下标(或索引)的方式调用指定位置的元素， 速度很快。
     数组的分类：
         按照维度：一维数组、 二维数组、 三维数组、 …
         按照元素的数据类型分：基本数据类型元素的数组、 引用数据类型元素的数组(即对
            象数组)
 */
public class Array {
    public static void main(String[] args) {
        //数组脚标越界异常(ArrayIndexOutOfBoundsException)
        int[] arr = new int[2];
        System.out.println(arr[2]);
        System.out.println(arr[-1]);
        //访问到了数组中的不存在的脚标时发生。
        //空指针异常(NullPointerException)
        int[] arr1 = null;
        System.out.println(arr[0]);
        //arr引用没有指向实体，却在操作实体中的元素时。
    }
}
