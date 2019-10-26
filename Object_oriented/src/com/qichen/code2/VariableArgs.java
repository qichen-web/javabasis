package com.qichen.code2;

/**
 * JavaSE 5.0 中提供了Varargs(variable number of arguments)机制，允许直接定
 * 义能和多个实参相匹配的形参。从而，可以用一种更简单的方式，来传递个数可
 * 变的实参。
 * 可变个数形参
 * @author qichen
 * @date 2019/10/26
 * @since JDK1.8
 */
/*
    说明：
        1. 声明格式： 方法名(参数的类型名 ...参数名)
        2. 可变参数：方法参数部分指定类型的参数个数是可变多个： 0个， 1个或多个
        3. 可变个数形参的方法与同名的方法之间，彼此构成重载
        4. 可变参数方法的使用与方法参数部分使用数组是一致的
        5. 方法的参数部分有可变形参，需要放在形参声明的最后
        6. 在一个方法的形参位置，最多只能声明一个可变个数形参
 */
public class VariableArgs {
    public static void main(String[] args) {

    }

    public void show(String ...strs){

    }
}
