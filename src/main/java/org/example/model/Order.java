package org.example.model;

import java.util.List;

public class Order {

    private String id;
    private String tableNumber;
    private List<OrderItem> items;
    private double price;
    private long createdAt;
    private boolean synced;


    public static class OrderItem {
        private final String itemName;
        private final double price;
        private final int quantity;

        public OrderItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        public String getItemName() {
            return itemName;
        }
        public double getPrice() {
            return price;
        }
        public int getQuantity() {
            return quantity;
        }


    }



}
