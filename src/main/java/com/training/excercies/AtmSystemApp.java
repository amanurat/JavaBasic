package com.training.excercies;

public class AtmSystemApp {

    public static void main(String[] args) {
        AtmSystem atmSystem = new AtmSystem();
        checkBalance(atmSystem);

        System.out.println("Deposit money : 100");
        atmSystem.deposit(100);


        System.out.println("Check money Balance is : "+ atmSystem.checkBalance());
        checkBalance(atmSystem);


        System.out.println("Withdraw money : 10 ");
        atmSystem.withdraw(10);

        System.out.println("Check money Balance is : "+ atmSystem.checkBalance());
        checkBalance(atmSystem);


        System.out.println("Withdraw money : 10 ");
        atmSystem.withdraw(1000);


        System.out.println("Check money Balance is : "+ atmSystem.checkBalance());
        checkBalance(atmSystem);


    }

    private static void checkBalance(AtmSystem atmSystem) {
        System.out.println("Your money balance : " + atmSystem.checkBalance());

    }
}
