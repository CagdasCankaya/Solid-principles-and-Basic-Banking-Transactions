package org.example;

public class BankingTransaction {
    public static void main(String[] args) {
        Account savingAccount = new SavingAccount("00111001");
        NotificationService emailService = new EmailNotification();
        AccountService accountService = new AccountService(emailService);

        accountService.deposit(savingAccount, 1000);
        accountService.withdraw(savingAccount,200);

        System.out.println("Money in : " + savingAccount.getBalance());
    }
}
