package com.javaacademy.lessons.lesson6.ex3.factory;

import com.javaacademy.lessons.lesson6.ex3.cars.Car;
import com.javaacademy.lessons.lesson6.ex3.cars.Machine;

public class CarFactory implements Factory {
    @Override
    public Machine getMachine() {
        return new Car();
    }
}
