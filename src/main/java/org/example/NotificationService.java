package org.example;


// 4-Interface Segregation Principle (ISP) = Classes are not dependent on
// a large interface containing methods they do not use
public interface NotificationService {
    void notify(String message);
}
