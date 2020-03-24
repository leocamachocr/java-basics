package com.ucr.progra2.poo;

public abstract class Vehicle {

    private Integer wheels;


    abstract void startEngine();
    abstract void shutdownEngine();

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }
}
