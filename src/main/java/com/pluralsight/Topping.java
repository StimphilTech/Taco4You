package com.pluralsight;

public abstract class Topping {
    private String name;

    public Topping(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public abstract double getPrice( String size);

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                '}';
    }

    public void add(Topping toppings) {

    }
}
