package com.pluralsight;

public class Meats extends PremiumTopping {

    public Meats(String name, double price, boolean extra) {
        super(name, price, extra);
    }

    public double getPrice(String size) {
        switch (size) {

            case "single":
                if (getExtra() == true) {
                    return 1.50;
                }else {
                    return 1;
                }
            case "3taco":
                if (getExtra() == true) {
                    return 3;
                }else {
                    return 2;
                }
            case "burrito":
                if (getExtra() == true) {
                    return 4.50;
                }else {
                    return 3;
                }
            default: return 0;
        }

    }
}
