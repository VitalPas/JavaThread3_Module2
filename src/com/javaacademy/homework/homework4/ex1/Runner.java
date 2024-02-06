package com.javaacademy.homework.homework4.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        AtomicInteger number = new AtomicInteger(1);

        List<Car> cars1 = new ArrayList<>(Stream.generate(() ->
                        new Car("а00" + number.getAndIncrement() + "ан799")).limit(9).toList());
        cars1.addAll(Stream.generate(() ->
                        new Car("а0" + number.getAndIncrement() + "ан799")).limit(41).toList());
        number.set(1);
        List<Car> cars2 = new ArrayList<>(Stream.generate(() ->
                        new Car("к00" + number.getAndIncrement() + "се178")).limit(9).toList());
        cars2.addAll(Stream.generate(() ->
                        new Car("к0" + number.getAndIncrement() + "се178")).limit(41).toList());

        Stream<Car> carStream = Stream.concat(cars1.stream(), cars2.stream());
        StringBuffer result = new StringBuffer();
        carStream.filter(car -> car.getNumber().matches(".04[0-9].*"))
                .forEach(car -> result.append(car.getNumber()).append(", "));
        System.out.println(result);
    }
}
