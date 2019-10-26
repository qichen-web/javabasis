package com.qichen.code2;

/**
 * @author qichen
 * @date 2019/10/26
 * @since JDK1.8
 */
/*
     方法，必须由其所在类或对象调用才有意义。若方法含有参数：
        形参：方法声明时的参数
        实参： 方法调用时实际传给形参的参数值
     Java的实参值如何传入方法呢？
        Java里方法的参数传递方式只有一种： 值传递。 即将实际参数值的副本
        （复制品）传入方法内，而参数本身不受影响。
            形参是基本数据类型：将实参基本数据类型变量的“数据值”传递给形参
            形参是引用数据类型：将实参引用数据类型变量的“地址值”传递给形参
 */
public class ValueTransfer {
    public static void main(String[] args) {
        //变量赋值
        //基本数据类型赋值
        System.out.println("===============基本数据类型=================");
        int m = 10;
        int n = 10;
        System.out.println("m=" + m + ",n=" + n);

        n = 20;
        System.out.println("m=" + m + ",n=" + n);

        System.out.println("=================================================");

        //引用数据类型赋值
        System.out.println("=================引用数据类型==================");

        Phone phone1 = new Phone();
        phone1.price = 10000;

        Phone phone2 = phone1;
        System.out.println("phone1.price="+phone1.price+",phone2.price="+phone2.price);

        phone2.price = 20000;
        System.out.println("phone1.price="+phone1.price+",phone2.price="+phone2.price);

    }

}
