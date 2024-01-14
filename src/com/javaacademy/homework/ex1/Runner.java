package com.javaacademy.homework.ex1;

import com.javaacademy.homework.ex1.animals.*;

public class Runner {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        Dog dog = new Dog();
        Bird bird = new Bird();

        Zoo<Tiger, Dog, Bird> zoo = new Zoo<>(tiger, dog, bird);

        zoo.getAnimal1().growl();
        zoo.getAnimal2().bark();
        zoo.getAnimal3().fly();

    }
}
