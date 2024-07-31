package org.example;

public class SmsNotification implements NotificationService{
    @Override
    public void notify(String message) {
        System.out.println("SMS was send" + message);
    }
}
