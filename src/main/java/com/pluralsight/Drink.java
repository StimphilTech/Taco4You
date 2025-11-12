package com.pluralsight;

import java.util.List;

public class Drink extends Taco {
    private String size;
    private String flavor;

    public Drink(String size, String shellType, List<Topping> toppings, boolean deepfried, String size1, String flavor) {
        super(size, shellType, toppings, deepfried);
        this.size = size1;
        this.flavor = flavor;
    }

    public double getPrice() {
        switch (size) {
            case "small":
                return 2.00;
            case "medium":
                return 2.50;
            case "large":
                return 3.00;
            default: return 0;
        }
    }
}


