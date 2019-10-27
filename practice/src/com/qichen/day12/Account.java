package com.qichen.day12;

/**
 * 模拟账户
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
     * 余额
     */
    private double balance;
    /**
     * 年利率
     */
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest() {
        return annualInterestRate / 12;
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
