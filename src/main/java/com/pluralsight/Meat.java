package com.pluralsight;

public class Meat extends PremiumTopping {

    public Meat(String name, boolean extra) {
        super(name, extra);
    }

    public double getPrice(String size) {
        switch (size) {

            case "single":
                if (getExtra()) {
                    return 1.50;
                }else {
                    return 1;
                }
            case "3taco":
                if (getExtra()) {
                    return 3;
                }else {
                    return 2;
                }
            case "burrito":
                if (getExtra()) {
                    return 4.50;
                }else {
                    return 3;
                }
            default: return 0;
        }

    }
}
