package com.qichen.code3;

/**
 * 多态的应用
 * 模板方法设计模式(TemplateMethod)
 *
 * @author qichen
 * @date 2019/10/28
 * @since JDK1.8
 */
/*
    抽象类体现的就是一种模板模式的设计，抽象类作为多个子类的通用模
    板，子类在抽象类的基础上进行扩展、改造，但子类总体上会保留抽象
    类的行为方式。

    解决的问题：
         当功能内部一部分实现是确定的， 一部分实现是不确定的。这时可以
        把不确定的部分暴露出去，让子类去实现。
         换句话说，在软件开发中实现一个算法时，整体步骤很固定、通用，
        这些步骤已经在父类中写好了。但是某些部分易变，易变部分可以抽
        象出来，供不同子类实现。这就是一种模板模式。
 */
/*
    模板方法设计模式是编程中经常用得到的模式。 各个框架、 类库中都有他的
    影子， 比如常见的有：
         数据库访问的封装
         Junit单元测试
         JavaWeb的Servlet中关于doGet/doPost方法调用
         Hibernate中模板程序
         Spring中JDBCTemlate、 HibernateTemplate等
 */
public class TemplateMethod {
    public static void main(String[] args) {
        SubTemplate t = new SubTemplate();
        t.getTime();
    }
}

abstract class Template {
    public final void getTime() {
        long start = System.currentTimeMillis();
        code(); //易变部分
        long end = System.currentTimeMillis();
        System.out.println("执行时间是： " + (end - start));
    }

    public abstract void code();
}

class SubTemplate extends Template {
    @Override
    public void code() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }
}
