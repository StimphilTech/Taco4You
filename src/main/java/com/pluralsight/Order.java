package com.pluralsight;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Taco> tacos;
    private List<Drink> drinks;
    private List<Chips> chips;
    private LocalDateTime orderTime;

    public Order(LocalDateTime orderTime) {
        this.tacos = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
        this.orderTime = orderTime;
    }

    public double calculateTotal() {


        double total = 0.0;

        // --- Taco Calculations ---
        for (Taco taco : tacos) {
            String size = taco.getSize().toLowerCase();
            switch (size) {
                case "single":
                    total += 3.50;
                    break;
                case "3-taco":
                    total += 9.00;
                    break;
                case "burrito":
                    total += 8.50;
                    break;
            }
        }

        // --- Drink Calculations ---
        for (Drink drink : drinks) {
            // Assuming Drink class has a getSize() method returning "small", "medium", or "large"
            String size = String.valueOf(drink.getPrice());
            System.out.println("The drink size is" + size);
            switch (size ) {
                case "small":
                    total += 2.00;
                    break;
                case "medium":
                    total += 2.50;
                    break;
                case "large":
                    total += 3.00;
                    break;
            }
        }

        // --- Chips Calculations ---
        for (Chips chipItem : chips) {
            // Assuming all chips are a flat rate of $1.50, regardless of type/size
            total += 1.50;
        }

        return total;
    }

    public String printOrder(){


        return "";
    }
}






