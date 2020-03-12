package com.progra2.references;

class Dog {
    String color;
    int age;
}

public class Reference {

    public static void main(String args[]) {
        Dog fido = new Dog();
        fido.age = 5;
        fido.color = "Brown";
        Dog[] family = new Dog[3];
        family[0] = fido;
        family[1] = fido;
        family[2] = fido;
        family[1].color = "white";
        for (Dog member : family) {
            System.out.println(member.color);//What should be the printed value??
        }
    }
}


