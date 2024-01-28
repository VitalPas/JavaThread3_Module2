package com.javaacademy.homework.homework3.ex5;

public class Animal {
    private final int lengthBody;
    private final int lengthTail;

    public Animal(int lengthBody, int lengthTail) {
        this.lengthBody = lengthBody;
        this.lengthTail = lengthTail;
    }

    public int getLengthBody() {
        return lengthBody;
    }

    public int getLengthTail() {
        return lengthTail;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "lengthBody=" + lengthBody +
                ", lengthTail=" + lengthTail +
                '}';
    }
}
