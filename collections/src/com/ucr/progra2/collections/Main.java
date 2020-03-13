package com.ucr.progra2.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        Car corolla = new Car();
        corolla.brand = "Toyota";
        corolla.color = "Red";
        corolla.type = "Sedan";
        corolla.model = "2012";
        Car car2 = new Car();
        car2.brand = "Nissan";
        car2.color = "Red";
        car2.type = "Sedan";
        car2.model = "2012";
//        System.out.println(cars.size());
//        System.out.println(cars.get(0));
//        System.out.println(cars.get(1));

        List carsLinked = new LinkedList();
        carsLinked.add(corolla);
        carsLinked.add(car2);

        System.out.println(carsLinked.size());
        System.out.println(carsLinked.get(0));
        System.out.println(carsLinked.get(1));


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

    public String toString(){
        return brand+","+model;
    }
}