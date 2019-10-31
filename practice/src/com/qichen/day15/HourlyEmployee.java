package com.qichen.day15;

/**
 * 定义HourlyEmployee类，实现按小时计算工资的
 * 员工处理。该类包括：
 * private成员变量wage和hour；
 * 实现父类的抽象方法earnings(),该方法返回wage*hour值；
 * toString()方法输出员工类型信息及员工的name， number,birthday。
 *
 * @author qichen
 * @date 2019/10/29
 * @since JDK1.8
 */
public class HourlyEmployee extends Employee {
    private double hour;//工作小时数
    private int wage;//每小时工资

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public double earning() {
        return hour * wage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{ " + super.toString() + "}";
    }
}
