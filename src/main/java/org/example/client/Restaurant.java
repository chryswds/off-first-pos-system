package org.example.client;

import org.example.model.Order;

import java.util.*;

public class Restaurant {
    private static final int TOTAL_TABLES = 15;
    private List<Table> tables;
    private Order.OrderItem menu;

    public Restaurant() {
        this.tables = new ArrayList<Table>();
        this.menu = new Order.OrderItem();
        initialiseTables();
    }

    private void initialiseTables() {
        for  (int i = 1; i <= TOTAL_TABLES; i++) {
            tables.add(new Table(i));
        }
    }

    public class Table{
        private int tableNumber;

        public Table(int tableNumber) {
            this.tableNumber = tableNumber;
        }

        public int getTableNumber() {
            return tableNumber;
        }
    }
}
