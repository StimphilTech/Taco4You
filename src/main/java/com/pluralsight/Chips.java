package com.pluralsight;

public class Chips extends Topping {
    public Chips(String name) {
        super(name);
    }

    @Override
    public double getPrice(String size) {
        return 1.50;
    }

//    public double getPrice() {
//        return 1.50 ;
//    }
}

