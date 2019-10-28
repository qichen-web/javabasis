package com.qichen.code3;

/**
 * 代码块
 * @author qichen
 * @date 2019/10/28
 * @since JDK1.8
 */
/*
     代码块(或初始化块)的作用：
         对Java类或对象进行初始化
     代码块(或初始化块)的分类：
         一个类中代码块若有修饰符， 则只能被static修饰， 称为静态代码块
        (static block)， 没有使用static修饰的， 为非静态代码块。
     static代码块通常用于初始化static的属性
 */
/*
     静态代码块：用static 修饰的代码块
        1. 可以有输出语句。
        2. 可以对类的属性、类的声明进行初始化操作。
        3. 不可以对非静态的属性初始化。即：不可以调用非静态的属性和方法。
        4. 若有多个静态的代码块，那么按照从上到下的顺序依次执行。
        5. 静态代码块的执行要先于非静态代码块。
        6. 静态代码块随着类的加载而加载，且只执行一次。

     非静态代码块：没有static修饰的代码块
        1. 可以有输出语句。
        2. 可以对类的属性、 类的声明进行初始化操作。
        3. 除了调用非静态的结构外， 还可以调用静态的变量或方法。
        4. 若有多个非静态的代码块， 那么按照从上到下的顺序依次执行。
        5. 每次创建对象的时候， 都会执行一次。 且先于构造器执行。
 */
/*
总结：程序中成员变量赋值的执行顺序
    声明成员变量的默认初始化
    显式初始化、 多个初始化块依次被执行（ 同级别下按先后顺序执行）
    构造器再对成员进行初始化操作
    通过” 对象.属性” 或” 对象.方法” 的方式， 可多次给属性赋值
 */
public class CodeBlock {
    public static void main(String[] args) {
        System.out.println("total = " + Person.total);
        System.out.println("total = " + Person.total);
    }
}
class Person {
    public static int total;
    static {
        total = 100;
        System.out.println("in static block!");
    }
}
