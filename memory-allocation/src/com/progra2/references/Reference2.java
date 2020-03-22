package com.progra2.references;

class Cat {
    String color;
    int age;
    String name;

    public boolean equals(Object obj){
        if (((Cat)obj).name.equals(name)
                && ((Cat)obj).age==(age)
                &&((Cat)obj).color.equals(color) ){
            return true;
        }else{
            return false;
        }
    }
}

public class Reference2 {

    public static void main(String args[]) {
        new Reference2().equalsExample();
//
//        Cat mimi = new Cat();
//        mimi.age = 3;
//        mimi.color = "Yellow";
//        Cat frodo = new Cat();
//        frodo.age = 2;
//        frodo.color = "Black";
//        Cat[] family = new Cat[3];
//        family[0] = new Cat();
//        family[1] = new Cat();
//        family[2] = mimi;
////        family[1] = frodo;
//        family[0].color="Red";
//        for (Cat member : family) {
//            System.out.println(member.color);//What should be the printed value??
//        }
    }

    void equalsExample(){

        Cat cat1 = new Cat();
        cat1.age = 3;
        cat1.color = "Yellow";
        cat1.name = "Garfield";

        Cat cat2 = new Cat();
        cat2.age = 3;
        cat2.color = "Yellow";
        cat2.name = "Garfield";

        System.out.println(cat1==cat2);//false
        System.out.println(cat1.equals(cat2));//true


    }
}


