package com.javaacademy.lessons.lesson6.ex6;

import java.util.function.Supplier;

public class Runner {
    public static void main(String[] args) {
        Supplier<Milk> supplier = Milk::new;
        Milk milk = supplier.get();
        Milk milk2 = supplier.get();

        System.out.println(milk);
        System.out.println(milk2);
    }
}
