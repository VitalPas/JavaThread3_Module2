package com.javaacademy.homework.homework2.ex1;

import java.util.ArrayDeque;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Worker worker = new Worker("Vasiliy");
        Worker worker2 = new Worker("Andrey");
        Worker worker3 = new Worker("Petrovich");
        LuggageCompartment luggageCompartment = new LuggageCompartment(
                new ArrayDeque<>(List.of(worker, worker2, worker3)));

        LuggageCompartment.arrivalPlane("SU-077");
        LuggageCompartment.arrivalPlane("AO-222");
        luggageCompartment.unloadLuggageCompartment();
    }
}
