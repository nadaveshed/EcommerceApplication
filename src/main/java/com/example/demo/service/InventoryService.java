package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    private NotificationService notificationService;

    @Autowired
    private ProductService productService;

    // Method to monitor product inventory and send notifications
    public void monitorInventory() {
        List<Product> products = productService.getAllProducts();
        for (Product product : products) {
            if (product.getQuantity() == 0) {
                sendNotification(product);
            }
        }
    }

    // Method to send notification when inventory is empty
    private void sendNotification(Product product) {
        String message = "The inventory for product " + product.getName() + " is empty.";
        notificationService.sendNotification(message, product);
    }
}
