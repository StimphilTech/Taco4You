package com.pluralsight;

public abstract class PremiumTopping  {
    private String name;
    private double price;
    private boolean extra;

    public PremiumTopping( String name, double price, boolean extra) {
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

    public boolean getExtra() {
        return extra;
    }


    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
