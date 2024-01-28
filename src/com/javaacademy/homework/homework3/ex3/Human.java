package com.javaacademy.homework.homework3.ex3;

public class Human {
    private final int height;
    private final int age;

    public Human(int height, int age) {
        this.height = height;
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "height=" + height +
                ", age=" + age +
                '}';
    }
}
