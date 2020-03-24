package com.ucr.progra2.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        Car corolla = new Car();
        corolla.brand = "Toyota";
        corolla.color = "Red";
        corolla.type = "Sedan";
        corolla.model = "2012";
        Car tida = new Car();
        tida.brand = "Nissan";
        tida.color = "Red";
        tida.type = "Sedan";
        tida.model = "2012";
//        System.out.println(cars.size());
//        System.out.println(cars.get(0));
//        System.out.println(cars.get(1));

        List<Car> cars = createListInstance();
        cars.add(corolla);
        cars.add(tida);
        cars.get(0);
        System.out.println(cars.size());
//        System.out.println(cars.get(0));
//        System.out.println(cars.get(1));

        for (Object car : cars) {
            System.out.println(car);
        }
        System.out.println();
        Iterator it = cars.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        cars.forEach(car -> System.out.println(car));

        /**
         * Iteration
         * - for
         * - while
         * - forEach//opcionales
         * - lambda expressions//opcionales
         *
         * Generics
         *
         * Different types of lists: Vector, LinkedList
         *
         *
         * Maps
         */

    }

    private static List createListInstance() {
//        return  new LinkedList();
        return new ArrayList();
    }
}


class Car {
    String brand;
    String color;
    String type;
    String model;

    public String toString() {
        return brand + "," + model;
    }
}