package com.qichen.day15;

/**
 * 定义SalariedEmployee类继承Employee类，实现按月计算工资的员工处
 * 理。该类包括： private成员变量monthlySalary；
 * 实现父类的抽象方法earnings(),该方法返回monthlySalary值； toString()方法输
 * 出员工类型信息及员工的name， number,birthday。
 *
 * @author qichen
 * @date 2019/10/29
 * @since JDK1.8
 */
public class SalariedEmployee extends Employee {
    private double monthlySalary;//月工资

    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earning() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{ " + super.toString() + "}";
    }
}
