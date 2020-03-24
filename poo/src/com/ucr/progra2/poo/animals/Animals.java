package com.ucr.progra2.poo.animals;

import java.util.List;

public class Animals {

}

interface Walkable {
    void walk();
}

interface Herbivorousable {
    void eatPlants();

    void eatTrees();
}

class Mammal extends Animals {

}

class Elephant extends Mammal implements Herbivorousable, Walkable {

    public void drink(){
    }
    @Override
    public void eatPlants() {

    }

    @Override
    public void eatTrees() {

    }

    @Override
    public void walk() {

    }
}


class Jungle {
    private List<Herbivorousable> animals;

    void eat() {
        for (Herbivorousable herb : animals) {
            herb.eatPlants();
        }
    }


}