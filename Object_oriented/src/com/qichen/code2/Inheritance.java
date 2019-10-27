package com.qichen.code2;

/**
 * 继承性(inheritance)
 *
 * @author qichen
 * @date 2019/10/27
 * @since JDK1.8
 */
/*
     为什么要有继承？
         多个类中存在相同属性和行为时，将这些内容抽取到单独一个类中，
        那么多个类无需再定义这些属性和行为，只要继承那个类即可。
     此处的多个类称为子类(派生类)， 单独的这个类称为父类(基类
        或超类)。 可以理解为:“子类 is a 父类”
     类继承语法规则:
        class Subclass extends SuperClass{ }

     作用：
         继承的出现减少了代码冗余，提高了代码的复用性。
         继承的出现，更有利于功能的扩展。
         继承的出现让类与类之间产生了关系，提供了多态的前提。
     注意：不要仅为了获取其他类中某个功能而去继承
 */
/*
     子类继承了父类，就继承了父类的方法和属性。
     在子类中，可以使用父类中定义的方法和属性，也可以创建新的数据和
        方法。
     在Java 中，继承的关键字用的是“extends”，即子类不是父类的子集，
    而是对父类的“扩展” 。

    关于继承的规则：
        子类不能直接访问父类中私有的(private)的成员变量和方法。
 */
/*
     Java只支持单继承和多层继承， 不允许多重继承
         一个子类只能有一个父类
         一个父类可以派生出多个子类
             class SubDemo extends Demo{ } //ok
             class SubDemo extends Demo1,Demo2...//error
 */
public class Inheritance {
    public static void main(String[] args) {
        Student student = new Student("zhangsan", '男', 12, 100001L, 20, 24, 36);
        System.out.println(student.name);
        System.out.println(student.toString());
        System.out.println(student.math);

        Person p = new Student("zhangsan", '男', 12, 100001L, 20, 24, 36);
        System.out.println(p.toString());
    }
}

/**
 * 定义一个学生类Student，它继承自Person类
 */
class Person {
    String name;
    char sex;
    int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name = " + name + " , sex = " + sex + " , age = " + age;
    }
}

class Student extends Person {
    long number;
    int math;
    int english;
    int computer;


    public Student(String name, char sex, int age, long number, int math, int english, int computer) {
        super(name, sex, age);
        this.number = number;
        this.math = math;
        this.english = english;
        this.computer = computer;
    }

    public double aver() {
        return (math + english + computer) / 3.0;
    }

    public int max() {
        int max = (math > english) ? math : english;
        return (max > computer) ? max : computer;
    }

    public int min() {
        int min = (math < english) ? math : english;
        return (min < computer) ? min : computer;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", number=" + number +
                ", math=" + math +
                ", english=" + english +
                ", computer=" + computer +
                "} ";
    }
}