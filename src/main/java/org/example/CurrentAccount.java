package org.example;


// // 3- Liskov Substitution Principle (LSP) = it extends the Account class,
// it can be used with a reference of type Account.
class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber){
        super(accountNumber,0);
    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
    }

    @Override
    public void withdraw(double amount) {
        balance-=amount;
    }
}
