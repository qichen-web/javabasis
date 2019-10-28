package com.qichen.day14;

/**
 * @author qichen
 * @date 2019/10/27
 * @since JDK1.8
 */
public class Circle {
    private double radius;
    private int id;

    private static int total;
    private static int init = 1001;

    public Circle() {
        id = init++;
        total++;
    }

    public static int getTotal() {
        return total;
    }

    public int getId() {
        return id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }
}
