package org.example;

// 5-Dependency Inversion Principle (DIP) = AccountService class has a dependency of type NotificationService.
//Adding new notification types or changing existing notification types does not require changing
// the AccountService class.

public class AccountService {
    private NotificationService notificationService;

    public AccountService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void deposit(Account account, double amount){
        account.deposit(amount);
        notificationService.notify(amount + " deposited for account number " + account.getAccountNumber());
    }
    public void withdraw(Account account, double amount){
        account.withdraw(amount);
        notificationService.notify(amount + " withdrawn for account number " + account.getAccountNumber());
    }
}
