package org.example;

// // 3- Liskov Substitution Principle (LSP) = it extends the Account class,
// it can be used with a reference of type Account.

class SavingAccount extends Account {
    public SavingAccount(String accountNumber){
        super(accountNumber,0);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=balance){
            balance-=amount;
        }
        else{
            System.out.println("There is no money in the account");
        }
    }
}
