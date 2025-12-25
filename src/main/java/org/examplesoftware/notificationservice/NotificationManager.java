package org.examplesoftware.notificationservice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    //notificationService will not change its value nce set hence final.
    // Also, the IDE will complain if you accidentally try to set it.
    //Check commented code in sendNotification method where it wil complain.
    private final NotificationService notificationService;

    public NotificationManager(@Qualifier("sms") NotificationService notificationService){
        this.notificationService = notificationService;
    }
    public void sendNotification(String message) {
        //this.notificationService = new SMSNotificationService();
        notificationService.send(message);
    }
}
