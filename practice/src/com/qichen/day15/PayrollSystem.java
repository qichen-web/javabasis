package com.qichen.day15;

/**
 * 定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各
 * 类雇员对象的引用。利用循环结构遍历数组元素，输出各个对象的类
 * 型,name,number,birthday,以及该对象生日。当键盘输入本月月份值时，如果本
 * 月是某个Employee对象的生日，还要输出增加工资信息。
 *
 * @author qichen
 * @date 2019/10/29
 * @since JDK1.8
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[20];

        employees[0] = new SalariedEmployee("水鹨", 1002, new MyDate(2015, 2, 3));
        employees[1] = new HourlyEmployee("跨界石",20123,new MyDate(2165,6,20));
    }
}
