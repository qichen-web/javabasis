package com.qichen.code3;

/**
 * 关键字： static
 * 如果想让一个类的所有实例共享数据，就用类变量！
 * @author qichen
 * @date 2019/10/27
 * @since JDK1.8
 */
/*
类属性、类方法的设计思想
     类属性作为该类各个对象之间共享的变量。 在设计类时,分析哪
        些属性不因对象的不同而改变，将这些属性设置为类属性。相应
        的方法设置为类方法。
     如果方法与调用者无关，则这样的方法通常被声明为类方法，由
        于不需要创建对象就可以调用类方法，从而简化了方法的调用。

     使用范围：
        在Java类中， 可用static修饰属性、 方法、 代码块、 内部类
     被修饰后的成员具备以下特点：
        随着类的加载而加载
        优先于对象存在
        修饰的成员，被所有对象所共享
        访问权限允许时，可不创建对象，直接被类调用
 */
/*
     类变量（类属性）由该类的所有实例共享
     没有对象的实例时，可以用类名.方法名()的形式访问由static修饰的类方法。
     在static方法内部只能访问类的static修饰的属性或方法， 不能访问类的非static的结构。

     因为不需要实例就可以访问static方法，因此static方法内部不能有this。 (也不能有super ? YES!)
     static修饰的方法不能被重写
 */
public class ClassVariables {

}
/*
    static的使用
        工具类的使用
        操作静态属性的方法
 */
