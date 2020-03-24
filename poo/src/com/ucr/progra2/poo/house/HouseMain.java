package com.ucr.progra2.poo.house;

public class HouseMain {
    public static void main() {
        BluePrint house = new BluePrint();
        house.setColor("Blue");
        house.setDimension(new Integer[]{2, 3});

        BluePrint house2 = new BluePrint();
        house.setColor("Red");
        house.setDimension(new Integer[]{2, 3});
    }
}
