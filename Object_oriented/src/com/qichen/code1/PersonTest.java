package com.qichen.code1;

/**
 * 类和对象的使用（面向对象思想落地的实现）
 * 1.创建类，设计类的成员
 * 2.创建类的对象
 * 3.通过“对象.属性”“对象.方法”调用对象的结构
 * @author qichen
 * @date 2019/10/24
 * @since JDK1.8
 */
/*
    创建类的对象 = 类的实例化 = 实例化类
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建类
        Person p1 = new Person();
        //调用对象的结构
        //调用属性
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);

        //调用方法
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");
    }

}

class Person {

    //属性    对应类中的成员变量
    //Field = 属性 = 成员变量 = 域、字段
    String name;
    int age = 1;
    boolean isMale;

    //方法    对应类中的成员方法
    //Method = (成员)方法 = 函数
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void talk(String language) {
        System.out.println("说话，语言：" + language);
    }


}
