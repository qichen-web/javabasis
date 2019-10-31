package com.qichen.day15;

/**
 * @author qichen
 * @date 2019/10/29
 * @since JDK1.8
 */
public interface Exce2 {
}
/*
定义一个接口用来实现两个对象的比较。
interface CompareObject{
public int compareTo(Object o); //若返回值是 0 , 代表相等; 若为正数， 代表当
前对象大；负数代表当前对象小
}
 */
interface CompareObject{
    //若返回值是 0 , 代表相等; 若为正数， 代表当前对象大；负数代表当前对象小
    public int compareTo(Object o);
}
/*
定义一个Circle类， 声明radius属性， 提供getter和setter方法
 */
class Circle{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
/*
定义一个ComparableCircle类， 继承Circle类并且实现CompareObject接口。 在
ComparableCircle类中给出接口中方法compareTo的实现体， 用来比较两个圆的半
径大小。
 */
class ComparableCircle extends Circle implements CompareObject{

    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle)o;
            if (this.getRadius()>c.getRadius()){
                return 1;
            }else if (this.getRadius()<c.getRadius()){
                return -1;
            }else{
                return 0;
            }
        }else {
            return 0;
//            throw new RuntimeException("传入数据类型不一致");
        }
    }
}

