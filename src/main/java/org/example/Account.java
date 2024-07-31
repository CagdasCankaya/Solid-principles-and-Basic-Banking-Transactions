package org.example;


// 1-Single Responsibility Principle (SRP) = Basis of account transactions

// 2- Open/Closed Principle (OCP) = abstract class,  it by modifying existing code to modify new account types
abstract class Account {
    protected  String accountNumber;
    protected  double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
