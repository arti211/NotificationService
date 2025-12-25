package org.examplesoftware.notificationservice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {
    public void send(String message) {
        System.out.printf("Sending message through email: %s%n", message);
    }
}
