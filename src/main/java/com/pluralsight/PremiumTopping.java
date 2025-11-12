package com.pluralsight;

public abstract class PremiumTopping extends  Topping  {

    private boolean extra;

    public PremiumTopping(String name, boolean extra) {
        super(name);
        this.extra = extra;
    }



    public abstract double getPrice( String size);

    public boolean getExtra() {
        return extra;
    }


    @Override
    public String toString() {
        return "PremiumTopping{" +
                "extra=" + extra +
                '}';
    }
}
