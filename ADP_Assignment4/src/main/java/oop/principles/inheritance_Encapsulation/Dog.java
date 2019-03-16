package oop.principles.inheritance_Encapsulation;

import oop.principles.inheritance_Encapsulation.Animal;

public class Dog extends Animal {

    String name = "Spider";

    public String dogDetails() {
        //System.out.println(name+" has"+noOfLegs+" legs");
        return name + " has " + noOfLegs + " legs";
    }
}
