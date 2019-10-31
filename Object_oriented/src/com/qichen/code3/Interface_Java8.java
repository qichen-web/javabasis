package com.qichen.code3;

/**
 * Java 8中关于接口的改进
 * @author qichen
 * @date 2019/10/29
 * @since JDK1.8
 */
/*
    Java 8中，你可以为接口添加静态方法和默认方法。从技术角度来说，这是完
        全合法的，只是它看起来违反了接口作为一个抽象定义的理念。
    静态方法： 使用 static 关键字修饰。 可以通过接口直接调用静态方法，并执行
        其方法体。我们经常在相互一起使用的类中使用静态方法。你可以在标准库中
        找到像Collection/Collections或者Path/Paths这样成对的接口和类。
    默认方法： 默认方法使用 default 关键字修饰。可以通过实现类对象来调用。
        我们在已有的接口中提供新方法的同时，还保持了与旧版本代码的兼容性。
 */
/*
     若一个接口中定义了一个默认方法，而另外一个接口中也定义了一个同名同
        参数的方法（不管此方法是否是默认方法），在实现类同时实现了这两个接
        口时，会出现： 接口冲突。
         解决办法：实现类必须覆盖接口中同名同参数的方法，来解决冲突。
     若一个接口中定义了一个默认方法，而父类中也定义了一个同名同参数的非
        抽象方法，则不会出现冲突问题。因为此时遵守： 类优先原则。 接口中具有
        相同名称和参数的默认方法会被忽略。
 */
public class Interface_Java8 {
}
interface Filial {// 孝顺的
    default void help() {
        System.out.println("老妈，我来救你了");
    }
}
interface Spoony {// 痴情的
    default void help() {
        System.out.println("媳妇， 别怕，我来了");
    }
}
class Man implements Filial, Spoony {
    @Override
    public void help() {
        System.out.println("我该怎么办呢？ ");
        Filial.super.help();
        Spoony.super.help();
    }
}
