package com.qichen.day15;

/**
 * @author qichen
 * @date 2019/10/29
 * @since JDK1.8
 */
public class interfaceExce1 {

}

interface A {
    int x = 0;
}

class B {
    int x = 1;
}

class C extends B implements A {
    public void pX() {
        System.out.println(A.x);
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        new C().pX();
    }
}

interface Playable {
    void play();
}

interface Bounceable {
    void play();
}

interface Rollable extends Playable,
        Bounceable {
    Ball ball = new Ball("PingPang");
}

class Ball implements Rollable {
    private String name;

    public String getName() {
        return name;
    }

    public Ball(String name) {
        this.name = name;
    }

    @Override
    public void play() {
//        ball = new Ball("Football");
        System.out.println(ball.getName());
    }
}
