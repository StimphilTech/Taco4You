package com.pluralsight;

public abstract class Topping {
    private String name;
    private double price;
    private boolean extra;

    public Topping(String name, double price, boolean extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    public String getName() {
        return name;
    }

    public double getPrice( String size) {
        return price;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
