package org.examplesoftware.notificationservice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier ("sms")
public class SMSNotificationService implements NotificationService {
    public void send(String message) {
        System.out.printf("Sending message through SMS: %s%n", message);
    }
}
