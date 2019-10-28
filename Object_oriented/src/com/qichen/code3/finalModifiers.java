package com.qichen.code3;

/**
 * 关键字： final
 *
 * @author qichen
 * @date 2019/10/28
 * @since JDK1.8
 */
/*
    在Java中声明类、 变量和方法时， 可使用关键字final来修饰,表示“最终的” 。
        final标记的类不能被继承。 提高安全性， 提高程序的可读性。
        String类、 System类、 StringBuffer类
        final标记的方法不能被子类重写。
        比如： Object类中的getClass()。
        final标记的变量(成员变量或局部变量)即称为常量。 名称大写， 且只
            能被赋值一次。
        final标记的成员变量必须在声明时或在每个构造器中或代码块中显式赋
            值， 然后才能使用。
        final double MY_PI = 3.14;
 */
/*
    final属性赋值
        显示初始化；代码块中初始化；构造器初始化

        要在类实例化前完成赋值（诞生前）
 */
public class finalModifiers {

}
