package com.javaacademy.homework.homework2.ex1;

import java.util.ArrayDeque;
import java.util.Deque;

public class LuggageCompartment {
    public static Deque<Suitcase> suitcases = new ArrayDeque<>();
    private Deque<Worker> workers;

    public LuggageCompartment(ArrayDeque<Worker> workers) {
        this.workers = workers;
    }

    public void setWorkers(ArrayDeque<Worker> workers) {
        this.workers = workers;
    }

    public Deque<Suitcase> getSuitcases() {
        return suitcases;
    }

    public Deque<Worker> getWorkers() {
        return workers;
    }

    public static void arrivalPlane(String flightNumber) {
        for (int i = 0; i < 20; i++) {
            suitcases.add(new Suitcase(flightNumber));
        }
    }

    public void unloadLuggageCompartment() {
        while (!suitcases.isEmpty()) {
            Worker worker = workers.removeFirst();
            worker.throwSuitcase(suitcases);
            workers.addLast(worker);
        }
    }
}
