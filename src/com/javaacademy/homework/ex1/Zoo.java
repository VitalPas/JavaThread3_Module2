package com.javaacademy.homework.ex1;

import com.javaacademy.homework.ex1.animals.Animal;

public class Zoo<T extends Animal, S extends Animal, V extends Animal> {
    private T animal1;
    private S animal2;
    private V animal3;

    public Zoo(T animal1, S animal2, V animal3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public T getAnimal1() {
        return animal1;
    }

    public S getAnimal2() {
        return animal2;
    }

    public V getAnimal3() {
        return animal3;
    }

    public void setAnimal1(T animal1) {
        this.animal1 = animal1;
    }

    public void setAnimal2(S animal2) {
        this.animal2 = animal2;
    }

    public void setAnimal3(V animal3) {
        this.animal3 = animal3;
    }
}