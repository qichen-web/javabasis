package com.qichen.code2;

/**
 * 理解“万事万物皆对象”
 * @author qichen
 * @date 2019/10/25
 * @since JDK1.8
 */
/*
    1.在Java语言范畴中，我们都将功能、结构等封装到类中，通过类的实例化，来调用具体的功能结构
    2.涉及到Java语言与前端Html、后端数据库交互时，前后端的结构在Java层面交互时，都体现为类、对象
 */
/*
    匿名对象的使用
        创建对象，没有显式赋名（变量名）
        只能调用一次

 */
public class InstanceTest {
    public static void main(String[] args) {

        //匿名
        new Phone().sendEmail();
    }
}
class Phone{
    double price;

    public void sendEmail(){
        System.out.println("发送邮件");
    }

    public void playGame(){
        System.out.println("打游戏");
    }
}
