package org.example;

public class EmailNotification implements NotificationService{
    @Override
    public void notify(String message) {
        System.out.println("Email was send " + message);
    }
}
