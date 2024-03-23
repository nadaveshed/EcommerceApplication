package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    // Method to send notification via email, SMS, push notification, etc.
    public void sendNotification(String message, Product product) {
        // Log the notification message
        System.out.println("Notification: " + message);
    }
}