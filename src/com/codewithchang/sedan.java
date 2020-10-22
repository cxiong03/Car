package com.codewithchang;

public class sedan extends Car {
    private String size;

    public sedan(String color, String model, String vin, int tireCount, int year, boolean isOn, String size) {
        super(color, model, vin, tireCount, year, isOn);
        this.size = size;
    }
}
