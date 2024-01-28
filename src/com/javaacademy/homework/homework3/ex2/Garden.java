package com.javaacademy.homework.homework3.ex2;

@FunctionalInterface
public interface Garden<T extends Fruit> {

    T getFruit();
}
