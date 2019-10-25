package com.qichen.code1;

/**
 * 属性
 *
 * @author qichen
 * @date 2019/10/25
 * @since JDK1.8
 */
/*
     语法格式：
            修饰符 数据类型 属性名 = 初始化值 ;
         说明1: 修饰符
             常用的权限修饰符有： private、缺省、 protected、 public
             其他修饰符： static、 final (暂不考虑)
         说明2：数据类型
             任何基本数据类型(如int、 Boolean) 或 任何引用数据类型。
         说明3：属性名
             属于标识符，符合命名规则和规范即可。
 */
/*
变量的分类：成员变量与局部变量

 在方法体外，类体内声明的变量称为成员变量。
 在方法体内部声明的变量称为局部变量。

    成员变量
        实例变量（不以static修饰）
        类变量（以static修饰）
    局部变量
        形参（方法、构造器中定义的变量）
        方法局部变量（在方法内定义）
        代码块局部变量（在代码块内定义）

 注意：二者在初始化值方面的异同:
    同： 都有生命周期
    异： 局部变量除形参外，均需显式初始化。
 */

/*
                    成员变量                                    局部变量
声明的位置       直接声明在类中                             方法形参或内部、代码块内、构造器内等
修饰符             private、 public、 static、 final等     不能用权限修饰符修饰，可以用final修饰
初始化值        有默认初始化值                             没有默认初始化值，必须显式赋值，方可使用
内存加载位置      堆空间 或 静态域内                          栈空间
 */
public class UserTest {

}

class User {
    private int age; //声明private变量 age
    public String name = "Lila"; //声明public变量 name
}
