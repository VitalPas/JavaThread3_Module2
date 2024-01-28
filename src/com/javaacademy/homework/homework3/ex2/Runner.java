package com.javaacademy.homework.homework3.ex2;

public class Runner {
    public static void main(String[] args) {

        Garden<Apple> appleFarm = Apple::new;
        Garden<Apricot> apricotFarm = Apricot::new;

        Apple apple = appleFarm.getFruit();
        Apricot apricot = apricotFarm.getFruit();
        System.out.println(apple);
        System.out.println(apricot);
    }
}
