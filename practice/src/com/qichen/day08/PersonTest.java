package com.qichen.day08;

/**
 * @author qichen
 * @date 2019/10/25
 * @since JDK1.8
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.sex = 0;

        p1.study();
        p1.showAge();
        System.out.println(p1.addAge(2));
        p1.showAge();

    }
}

class Person {
    String name;
    int age;
    /**
     * sex的值
     * 0：男性
     * 1：女性
     * 2：保密
     */
    int sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println(age);
    }

    public int addAge(int i) {
        age = age + i;
        return age;
    }
}

