package com.sryabova;

public class Animal {
    int age;
    String color;
    String name;

    public Animal(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public String getHappy(boolean character){
        String characterToStr;
        if (character) {
            characterToStr = "happy";
        } else {
            characterToStr = "sad";
        }
        return characterToStr;
    }
}
