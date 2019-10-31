package com.qichen.day15;

/**
 * @author qichen
 * @date 2019/10/29
 * @since JDK1.8
 */
public class USBTest {
    public static void main(String[] args) {

    }
}

interface USB{
    //定义外形参数，传输最大速率等参数

    void start();

    void stop();
}

class computer implements USB{

    @Override
    public void start() {
        System.out.println("电脑开始工作");
    }

    @Override
    public void stop() {
        System.out.println("电脑结束工作");
    }
}

class flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}
