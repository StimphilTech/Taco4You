package com.pluralsight;

import java.util.List;

public class Taco {
    private String size;
   private String shellType;
    private List<Topping> Toppings;
    private boolean deepfried;

    public Taco(String size, String shellType, List<Topping> toppings, boolean deepfried) {
        this.size = size;
        this.shellType = shellType;
        Toppings = toppings;
        this.deepfried = deepfried;
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
        return Toppings;
    }

    public void setToppings(List<Topping> toppings) {
        Toppings = toppings;
    }

    public boolean isDeepfried() {
        return deepfried;
    }

    public void setDeepfried(boolean deepfried) {
        this.deepfried = deepfried;
    }

    public double calculatePrice(){
        return 0;
    }

    @Override
    public String toString() {
        return "Taco{" +
                "size='" + size + '\'' +
                ", shellType='" + shellType + '\'' +
                ", Toppings=" + Toppings +
                ", deepfried=" + deepfried +
                '}';
    }
}
