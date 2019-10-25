package com.qichen.code1;

/**
 * 方 法
 *
 * @author qichen
 * @date 2019/10/25
 * @since JDK1.8
 */
/*
    什么是方法(method、函数):
         方法是类或对象行为特征的抽象，用来完成某个功能操作。在某些语言中
        也称为函数或过程。
         将功能封装为方法的目的是，可以实现代码重用，简化代码
         Java里的方法不能独立存在，所有的方法必须定义在类里。

    方法的声明格式：
        修饰符 返回值类型 方法名（参数类型 形参1, 参数类型 形参2, ….）｛
            方法体程序代码
        return 返回值;
        ｝
    其中：
        修饰符： public,缺省,private, protected等
    返回值类型：
         没有返回值： void。
         有返回值，声明出返回值的类型。与方法体中“return 返回值” 搭配使用
    方法名：属于标识符，命名时遵循标识符命名规则和规范，“见名知意”
    形参列表：可以包含零个，一个或多个参数。多个参数时，中间用“,”隔开
    返回值：方法在执行完毕后返还给调用它的程序的数据。

 */
public class CustomerTest {
}

class Customer {
    private int age;

    public int getAge() { //声明方法getAge()
        return age;
    }

    public void setAge(int i) { //声明方法setAge
        age = i; //将参数i的值赋给类的成员变量age
    }
}