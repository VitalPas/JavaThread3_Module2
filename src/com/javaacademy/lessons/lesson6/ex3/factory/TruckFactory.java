package com.javaacademy.lessons.lesson6.ex3.factory;

import com.javaacademy.lessons.lesson6.ex3.cars.Machine;
import com.javaacademy.lessons.lesson6.ex3.cars.Truck;

public class TruckFactory implements Factory {
    @Override
    public Machine getMachine() {
        return new Truck();
    }
}
