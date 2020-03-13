package com.ucr.progra2.collections;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        Car corolla = new Car();
        corolla.brand = "Toyota";
        corolla.color = "Red";
        corolla.type = "Sedan";
        corolla.model = "2012";
        ArrayList cars = new ArrayList();
        cars.add(corolla);


        /**
         * Iteration
         * - for
         * - while
         * - forEach
         * - lambda expressions
         *
         * Generics
         *
         * Different types of lists: Vector, LinkedList
         *
         *
         * Maps
         */

    }
}


class Car {
    String brand;
    String color;
    String type;
    String model;
}