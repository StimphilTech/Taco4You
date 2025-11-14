package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Taco {
    private String size;
    private String shellType;
    private List<Topping> toppings;
    private boolean deepfried;

    public Taco(String size, String shellType, boolean deepfried) {
        this.size = size;
        this.shellType = shellType;
        this.toppings = new ArrayList<>();
        this.deepfried = deepfried;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getShellType() {
        return shellType;
    }

    public void setShellType(String shellType) {
        this.shellType = shellType;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public boolean isDeepfried() {
        return deepfried;
    }

    public void setDeepfried(boolean deepfried) {
        this.deepfried = deepfried;
    }

    public double calculatePrice() {
        String normalizedSize = size.toLowerCase();

        switch (normalizedSize) {
            case "single":
                return 3.50;
            case "3-taco":
                return 9.00;
            case "burrito":
                return 8.50;
            default:
                // Handle unknown sizes
                System.out.println("Error: Unknown size '" + size + "'");
                return 0.0;
        }

//        @Override
//        public String toString ()
//        return "Taco{" +
//                "size='" + size + '\'' +
//                ", shellType='" + shellType + '\'' +
//                ", Toppings=" + toppings +
//                ", deepfried=" + deepfried +
//                '}';
//    }

//        return size + "|" + shellType + "|" + toppings + "|" + deepfried + "|";


    }
}
