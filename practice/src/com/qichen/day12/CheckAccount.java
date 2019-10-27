package com.qichen.day12;

/**
 * @author qichen
 * @date 2019/10/27
 * @since JDK1.8
 */
public class CheckAccount extends Account {
    /**
     * 可透支限额
     */
    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < this.getBalance()) {
            super.withdraw(amount);
        } else if (amount < getBalance() + overdraft) {
            System.out.println("成功取款" + amount + "元");
            overdraft -= (amount - getBalance());
            setBalance(0);
        } else {
            System.out.println("取款失败，超过可透支额的限额");
        }
    }
}
