package com.sryabova;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal(2, "black", "dog");
        Animal cat = new Animal(1, "white", "cat");
        Animal mouse = new Animal(3, "grey", "mouse");

        Animal[] animals = {dog, cat, mouse};
        boolean character = true;
        for (int i = 0; i < animals.length; i++) {
            character = !character;
            System.out.println("Hey, Im "+ animals[i].name +
                    " " + animals[i].age + " years old, my color is " +
                    animals[i].color + " ,i'm " + animals[i].getHappy(character));
        }
    }
}
