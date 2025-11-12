package com.pluralsight;

import java.util.List;

public class Chips extends Taco {
    public Chips(String size, String shellType, List<Topping> toppings, boolean deepfried) {
        super(size, shellType, toppings, deepfried);
    }


    public double getPrice(String size) {
        return 1.50;
    }


}

