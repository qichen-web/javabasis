package com.qichen.code2;

/**
 * 包装类(Wrapper)的使用
 * 包装类在实际开发中用的最多的在于字符串变为基本数据类型
 * @author qichen
 * @date 2019/10/27
 * @since JDK1.8
 */
/*
     针对八种基本数据类型定义相应的引用类型—包装类（封装类）
     有了类的特点，就可以调用类中的方法， Java才是真正的面向对象
 */
/*
     基本数据类型包装成包装类的实例 ---装箱
         通过包装类的构造器实现：
            int i = 500; Integer t = new Integer(i);
         还可以通过字符串参数构造包装类对象：
            Float f = new Float(“4.56”);
            Long l = new Long(“asdf”); //NumberFormatException
     获得包装类对象中包装的基本类型变量 ---拆箱
         调用包装类的.xxxValue()方法：
            boolean b = bObj.booleanValue();
     JDK1.5之后，支持自动装箱，自动拆箱。但类型必须匹配。
 */
/*
    字符串转换成基本数据类型
         通过包装类的构造器实现：
            int i = new Integer(“12”);
         通过包装类的parseXxx(String s)静态方法：
            Float f = Float.parseFloat(“12.1”);
    基本数据类型转换成字符串
         调用字符串重载的valueOf()方法：
            String fstr = String.valueOf(2.34f);
         更直接的方式：
            String intStr = 5 + “”
 */
public class Wrapper {
    public static void main(String[] args) {
        int i = 500;
        Integer t = new Integer(i);
        Float f = new Float("4.56");
//        Long l = new Long("asdf"); //NumberFormatException
        int j = t.intValue();
    }
}
