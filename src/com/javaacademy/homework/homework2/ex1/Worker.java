package com.javaacademy.homework.homework2.ex1;

import java.util.Deque;

public class Worker {
    private final String name;

    public Worker(String name) {
        this.name = name;
    }

    public void throwSuitcase(Deque<Suitcase> suitcases) {
        Suitcase suitcase = suitcases.removeFirst();
        System.out.printf("%s: Мужики, кидаю чемодан %s\n", name, suitcase.getFlightNumber());
    }
}
