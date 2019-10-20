package com.qichen.day04;

/**
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
public class SwitchExce2 {
    public static void main(String[] args) {
        int a = 3;
        int x = 100;
        switch (a) {
            case 1:
                x += 5;
                break;
            case 2:
                x += 10;
                break;
            case 3:
                x += 16;
                break;
            default:
                x += 34;
        }
        System.out.println(x);
    }
}
