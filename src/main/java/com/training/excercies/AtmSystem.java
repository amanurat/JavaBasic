package com.training.excercies;

public class AtmSystem {

    private int moneyBalance = 0;

    public void deposit(int money) {
        this.moneyBalance += money;
    }

    public void withdraw(int money) {

        if (money > this.moneyBalance) {
            System.out.println("Cannot withdraw money over money balance!!");
            return;
        }

        this.moneyBalance -= money;
    }

    public int checkBalance() {
        return this.moneyBalance;
    }


    public int getMoneyBalance() {
        return moneyBalance;
    }

    public void setMoneyBalance(int moneyBalance) {
        this.moneyBalance = moneyBalance;
    }
}
