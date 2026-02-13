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
        private  String itemName;
        private double price;
        private int quantity;

        public OrderItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }


        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getTotalPrice() {
            return price * quantity;
        }




    }



}
