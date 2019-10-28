package com.qichen.day14;

/**
 * 模拟账户
 * 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密
 * 码”、“存款余额”、“利率”、“最小余额”，定义封装这些
 * 属性的方法。 账号要自动生成。
 * 编写主类，使用银行账户类，输入、输出3个储户的上述信息。
 * 考虑：哪些属性可以设计成static属性。
 *
 * @author qichen
 * @date 2019/10/27
 * @since JDK1.8
 */
public class Account {
    /**
     * 账号
     */
    private int id;
    /**
     * 密码
     */
    private String pwd = "000000";
    /**
     * 余额
     */
    private double balance;
    /**
     * 最小余额
     */
    private static double minMoney = 1.0;
    /**
     * 年利率
     */
    private static double InterestRate;
    private static int init = 1001;//自动赋值

    public Account() {
        id = init++;
    }

    public Account(String pwd, double balance) {
        this();
        this.pwd = pwd;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    public static double getInterestRate() {
        return InterestRate;
    }

    public static void setInterestRate(double interestRate) {
        InterestRate = interestRate;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("取款失败");
        } else {
            System.out.println("成功取款" + amount + "元");
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("不要搞事，存钱不能为负");
        } else {
            System.out.println("存钱" + amount + "成功");
            balance += amount;
        }
    }
}
