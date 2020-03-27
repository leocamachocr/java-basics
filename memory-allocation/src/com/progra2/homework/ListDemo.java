package com.progra2.homework;

public class ListDemo {

    public static void main(String... args) {
        List list = new ListImpl();

        list.add(1);
        list.add(4);
        list.add(6);
        list.add(8);

        System.out.println(list.toString());
        System.out.println("-----------------------");

        list.remove(6);
        System.out.println(list.toString());
        System.out.println("-----------------------");
        System.out.println(list.nextOf(4));
        System.out.println("-----------------------");
        System.out.println(list.previousOf(4));
        System.out.println("-----------------------");
        System.out.println(list.nextOf(1));
        System.out.println("-----------------------");
        System.out.println(list.previousOf(1));
        System.out.println("-----------------------");
        System.out.println(list.nextOf(8));
        System.out.println("-----------------------");
        System.out.println(list.previousOf(8));


    }
}
