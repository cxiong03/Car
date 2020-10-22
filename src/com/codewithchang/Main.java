package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Chang");
        Car myCar = new Car("White", "Subaru", "1234X", 2021);
        myCar.setModel("Ferrari");
        System.out.println(myCar.toString());
        myCar.displayDetails();
    }
}
