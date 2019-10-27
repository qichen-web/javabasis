package com.qichen.code2;

/**
 * 对象类型转换 (Casting )
 * @author qichen
 * @date 2019/10/27
 * @since JDK1.8
 */
/*
基本数据类型的Casting：
    自动类型转换：小的数据类型可以自动转换成大的数据类型
    如long g=20; double d=12.0f
    强制类型转换： 可以把大的数据类型强制转换(casting)成小的数据类型
    如 float f=(float)12.0; int a=(int)1200L
对Java对象的强制类型转换称为造型
    从子类到父类的类型转换可以自动进行
    从父类到子类的类型转换必须通过造型(强制类型转换)实现
    无继承关系的引用类型间的转换是非法的
    在造型前可以使用instanceof操作符测试一个对象的类型
 */
/*
    x instanceof A：检验x是否为类A的对象，返回值为boolean型。
         要求x所属的类与类A必须是子类和父类的关系，否则编译错误。
         如果x属于类A的子类B， x instanceof A值也为true。
 */
public class Casting {
}
