package com.pluralsight;

public class Sauces extends Topping {
    public Sauces(String name) {
        super(name);
    }

    @Override
    public double getPrice(String size) {
        return 0;
    }

    @Override
    public String toString() {
        return "Sauces{"+ getName() +"}";
    }
}


