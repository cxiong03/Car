package com.codewithchang;

public class sedan extends Car {
    private String size;

    public sedan(String color, String model, String vin, int tireCount, int year, boolean isOn, String size) {
        super(color, model, vin, tireCount, year, isOn);
        this.size = size;
    }

    public String getSize() { return this.size; }

    public void setSize(String size) { this.size = size; }

    @Override
    public String toString() {
        return "This vehicle is a " + size + " sedan.";
    }
}
