package com.qichen.code;

/**
 * @author qichen
 * @Date 2019/10/19
 * @since JDK1.8
 */
/*
    变量的概念：
        内存中的一个存储区域
        该区域的数据可以在同一类型范围内不断变化
        变量是程序中最基本的存储单元。包含变量类型、变量名和存储的值
    变量的作用：
        用于在内存中保存数据
    使用变量注意：
        Java中每个变量必须先声明，后使用     否则编译错误
        使用变量名来访问这块区域的数据
        变量的作用域：其定义所在的一对{ }内
        变量只有在其作用域内才有效
        同一个作用域内，不能定义重名的变量      反证法
 */
/*
    声明变量
         语法： <数据类型> <变量名称>
         例如： int var;
     变量的赋值
         语法： <变量名称> = <值>
         例如： var = 10;
     声明和赋值变量
         语法： <数据类型> <变量名> = <初始化值>
         例如： int var = 10;
 */
/*
    变量的分类
        -按数据类型
            基本数据类型
            引用数据类型
        -按声明的位置的不同
            在方法体外，类体内声明的变量称为成员变量。
                实例变量（不以static修饰）
                类变量（以static修饰）
            在方法体内部声明的变量称为局部变量。
                形参（方法、构造器中定义的变量）
                方法局部变量（在方法内定义）
                代码块局部变量（在代码块内定义）

            同： 都有生命周期 异： 局部变量除形参外，需显式初始化。
 */
public class Variable {
    public static void main(String[] args) {
        int var;
        var = 10;
        System.out.println(var);

        int age = 10;
        System.out.println(age);

        //
    }
}
