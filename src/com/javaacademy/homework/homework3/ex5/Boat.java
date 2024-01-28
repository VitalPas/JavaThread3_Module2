package com.javaacademy.homework.homework3.ex5;

public class Boat {
    private final int length;

    public Boat(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "length=" + length +
                '}';
    }
}
