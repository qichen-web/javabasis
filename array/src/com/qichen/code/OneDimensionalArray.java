package com.qichen.code;

/**
 * @author qichen
 * @date 2019/10/22
 * @since JDK1.8
 */
/*
     一维数组的声明方式：
        type var[] 或 type[] var；

     Java语言中声明数组时不能指定其长度(数组中元素的数)， 例如： int a[5]; //非法

 */
public class OneDimensionalArray {
    public static void main(String[] args) {
        //动态初始化： 数组声明且为数组元素分配空间与赋值的操作分开进行
        int[] arr1 = new int[3];
        arr1[0] = 3;
        arr1[1] = 9;
        arr1[2] = 8;

        String names[];
        names = new String[3];
        names[0] = "钱学森";
        names[1] = "邓稼先";
        names[2] = "袁隆平";

        //静态初始化： 在定义数组的同时就为数组元素分配空间并赋值。
        int arr2[] = new int[]{3, 9, 8};
        int[] arr3 = {3, 9, 8};
        String names2[] = {
                "李四光", "茅以升", "华罗庚"
        };

        /*
            定义并用运算符new为之分配空间后，才可以引用数组中的每个元素；
            数组元素的引用方式：数组名[数组元素下标]
                 数组元素下标可以是整型常量或整型表达式。如a[3] , b[i] , c[6*i];
                数组元素下标从0开始；长度为n的数组合法下标取值范围: 0 —>n-1； 如int a[]=new
                    int[3]; 可引用的数组元素为a[0]、 a[1]、 a[2]
            每个数组都有一个属性length指明它的长度，例如： a.length 指明数组a的长
                度(元素个数)
                数组一旦初始化，其长度是不可变的
         */

        /*
            数组是引用类型，它的元素相当于类的成员变量，因此数组一经
            分配空间，其中的每个元素也被按照成员变量同样的方式被隐式
            初始化。
         */

        int a[]= new int[5];
        System.out.println(a[3]); //a[3]的默认值为0

        /*
            对于基本数据类型而言，默认初始化值各有不同
            对于引用数据类型而言，默认初始化值为null(注意与0不同！ )
         */

        byte[] bytes = new byte[5];
        short[] shorts = new short[5];
        int[] ints = new int[5];
        long[] longs = new long[5];
        float[] floats = new float[5];
        double[] doubles = new double[5];
        char[] chars = new char[5];
        boolean[] booleans = new boolean[5];
        String[] strings = new String[5];

        System.out.println(bytes[0]);
        System.out.println(shorts[0]);
        System.out.println(ints[0]);
        System.out.println(longs[0]);
        System.out.println(floats[0]);
        System.out.println(doubles[0]);
        System.out.println(chars[0]);
        System.out.println(booleans[0]);
        System.out.println(strings[0]);
    }
}
