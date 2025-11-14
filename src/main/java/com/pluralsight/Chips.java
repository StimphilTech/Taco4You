package com.pluralsight;

import java.util.List;

public class Chips {
   private String salsaType;

    public Chips(String salsaType) {
        this.salsaType = salsaType;
    }

    public String getSalsaType() {
        return salsaType;
    }

    public double getPrice(String size) {
        return 1.50;
    }


}

