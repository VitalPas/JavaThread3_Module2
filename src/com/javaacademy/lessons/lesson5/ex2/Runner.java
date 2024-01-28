package com.javaacademy.lessons.lesson5.ex2;

import java.util.LinkedHashSet;

public class Runner {
    public static void main(String[] args) {
        //Создание коллекции с уникальными станциями, при этом сохраняющий порядок вставки
        LinkedHashSet<String> stations = new LinkedHashSet<>();
        stations.add("Станция №1");
        stations.add("Станция №2");
        stations.add("Станция №3");
        System.out.println(stations);
    }
}
