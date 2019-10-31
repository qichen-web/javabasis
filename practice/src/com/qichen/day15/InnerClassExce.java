package com.qichen.day15;

/**
 * @author qichen
 * @date 2019/10/31
 * @since JDK1.8
 */
public class InnerClassExce {
    public static void main(String[] args) {
        //静态成员内部类
        Person.dog dog = new Person.dog();
        dog.show();
        //非静态成员内部类
        Person person = new Person();
        Person.bird bird = person.new bird();
        bird.sing();
    }
}
class Person{
    String name;
    int age;

    public void eat(){

    }

    static class dog{
        String name;
        public void show(){

        }
    }
    class bird{
        String name;
        public void sing(){
            System.out.println("我是一只小小鸟");
            Person.this.eat();
        }

        public void display(String  name){
            System.out.println(name);
            System.out.println(this.name);//内部类
            System.out.println(Person.this.name);//外部类
        }
    }
}
