package com.pluralsight;

public class Cheese extends PremiumTopping{
    public Cheese(String name, boolean extra) {
        super(name, extra);
    }

    public double getPrice(String size) {
        switch (size) {

            case "single":
                if (getExtra()) {
                    return 1.05;
                }else {
                    return .75;
                }
            case "3taco":
                if (getExtra()) {
                    return 2.10;
                }else {
                    return 1.5;
                }
            case "burrito":
                if (getExtra()) {
                    return 3.15;
                }else {
                    return 2.25;
                }
            default: return 0;
        }

    }
}
