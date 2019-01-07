package com.daidao.learn.pattern.state;


/**
 * 抽象状态类
 * */
public abstract class AccountState {
    protected  Account acc;

    /**
     * 存钱
     * */
    public abstract void deposit(double amount);
    /**
     * 取钱
     * */
    public abstract void withdraw(double amount);
    /**
     * 计算利息
     * */
    public abstract void computeInterest();

    public abstract void stateCheck();

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }
}
