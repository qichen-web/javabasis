package com.qichen.code2;

/**
 * 关键字： super
 *
 * @author qichen
 * @date 2019/10/27
 * @since JDK1.8
 */
/*
在Java类中使用super来调用父类中的指定操作：
    super可用于访问父类中定义的属性
    super可用于调用父类中定义的成员方法
    super可用于在子类构造器中调用父类的构造器
注意：
    尤其当子父类出现同名成员时， 可以用super表明调用的是父类中的成员
    super的追溯不仅限于直接父类
    super和this的用法相像， this代表本类对象的引用， super代表父类的内存
    空间的标识
 */
/*
调用父类的构造器
    子类中所有的构造器默认都会访问父类中空参数的构造器
     当父类中没有空参数的构造器时， 子类的构造器必须通过this(参
        数列表)或者super(参数列表)语句指定调用本类或者父类中相应的
        构造器。 同时， 只能”二选一”， 且必须放在构造器的首行
    如果子类构造器中既未显式调用父类或本类的构造器， 且父类中又
        没有无参的构造器， 则编译出错
 */
public class Super {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getLength());
        System.out.println(cylinder.findArea());
        System.out.println(cylinder.findVolume());
    }
}

class Circle {
    private double radius;

    /**
     * 空参构造器,将radius属性初始化为1
     */
    public Circle() {
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 计算圆的面积
     *
     * @return
     */
    public double findArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private double length;

    /**
     * 空参构造器，将length属性初始化为1
     */
    public Cylinder() {
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 计算圆柱体积
     *
     * @return
     */
    public double findVolume() {
        double area = super.findArea();
        return area * length;
    }

    @Override
    public double findArea() {
        double area = super.findArea();
        double radius = super.getRadius();
        return 2 * area + length * 2 * radius * Math.PI;
    }
}
