package com.pluralsight;

import java.util.List;

public class Taco {
    private String size;
   private String shellType;
    private List<PremiumTopping> toppingsp;
    private List<RegularTopping> toppingsr;
    private boolean deepfried;

    public Taco(String size, String shellType, List<PremiumTopping> toppingsp,List<RegularTopping> toppingsr, boolean deepfried) {
        this.size = size;
        this.shellType = shellType;
        this.toppingsp = toppingsp;
        this.toppingsr = toppingsr;
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

    public List<PremiumTopping> getToppingsp() {
        return toppingsp;
    }

    public void setToppingsp(List<PremiumTopping> toppingsp) {
        this.toppingsp = toppingsp;
    }

    public List<RegularTopping> getToppingsr() {
        return toppingsr;
    }

    public void setToppingsr(List<RegularTopping> toppingsr) {
        this.toppingsr = toppingsr;
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
//        return "Taco{" +
//                "size='" + size + '\'' +
//                ", shellType='" + shellType + '\'' +
//                ", Toppings=" + Toppings +
//                ", deepfried=" + deepfried +
//                '}';
//    }

    return size+"|"+shellType+"|"+toppingsp+"|"+toppingsr+"|"+deepfried+"|";


}}
