package com.progra2.references;

class Cat {
    String color;
    int age;
}

public class Reference2 {

    public static void main(String args[]) {
        Cat mimi = new Cat();
        mimi.age = 3;
        mimi.color = "Yellow";
        Cat frodo = new Cat();
        frodo.age = 2;
        frodo.color = "Black";
        Cat[] family = new Cat[3];
        family[0] = new Cat();
        family[1] = new Cat();
        family[2] = mimi;
//        family[1] = frodo;
        family[0].color="Red";
        for (Cat member : family) {
            System.out.println(member.color);//What should be the printed value??
        }
    }
}


