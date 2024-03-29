package com.qichen.code3;

/**
 * 接口(interface)
 *
 * 有了接口， 就可以得到多重继承的效果。
 * 接口就是规范，定义的是一组规则，体现了现实世界中“如果你是/要...则
 * 必须能...”的思想。 继承是一个"是不是"的关系，而接口实现则是 "能不能"
 * 的关系。
 *  接口的本质是契约，标准，规范，就像我们的法律一样。制定好后大家都
 * 要遵守。
 * @author qichen
 * @date 2019/10/29
 * @since JDK1.8
 */
/*
     接口(interface)是抽象方法和常量值定义的集合。
     接口的特点：
        用interface来定义。
        接口中的所有成员变量都默认是由public static final修饰的。
        接口中的所有抽象方法都默认是由public abstract修饰的。
        接口中没有构造器。
        接口采用多继承机制。
 */
/*
     定义Java类的语法格式： 先写extends，后写implements
         class SubClass extends SuperClass implements InterfaceA{ }
     一个类可以实现多个接口， 接口也可以继承其它接口。
     实现接口的类中必须提供接口中所有方法的具体实现内容，方可实
        例化。否则，仍为抽象类。
     接口的主要用途就是被实现类实现。 （面向接口编程）
     与继承关系类似，接口与实现类之间存在多态性
     接口和类是并列关系， 或者可以理解为一种特殊的类。 从本质上讲，
        接口是一种特殊的抽象类，这种抽象类中只包含常量和方法的定义
        (JDK7.0及之前)， 而没有变量和方法的实现。
 */
public class interfaceTest extends DD implements BB,CC{

}

class DD{

}

interface AA{

}
interface aa{

}

interface BB extends AA,aa{

}
interface CC{

}
