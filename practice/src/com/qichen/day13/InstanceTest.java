package com.qichen.day13;

/**
 * @author qichen
 * @date 2019/10/27
 * @since JDK1.8
 */
public class InstanceTest {
    private static void method(Person e) {
        System.out.println(e.getInfo());
        if (e instanceof Graduate) {
            System.out.println("a graduated student");
        }
        if (e instanceof Student) {
            System.out.println("a student");
        }
        if (e instanceof Person) {
            System.out.println("a person");
        }
    }

    public static void main(String[] args) {
        method(new Graduate());
        System.out.println("*-*-*-*-*-*-*-**-*-*-*-");
        method(new Student());
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-");
        method(new Person());
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-");
    }
}

class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age;
    }
}

class Student extends Person {
    protected String school = "pku";

    @Override
    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school;
    }
}

class Graduate extends Student {
    public String major = "IT";

    @Override
    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school + "\nmajor:" + major;
    }

}
