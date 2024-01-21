package com.javaacademy.homework.homework1.ex3;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Item car = new Item("Car");
        Item spoor = new Item("Spoor");
        Item computer = new Item("Computer");
        Item mouse = new Item("Mouse");
        Item bar = new Item("Bar");

        Stock stock = new Stock();

        stock.addItem(car);
        stock.addItem(spoor);
        System.out.println("Добавили вещи: " + stock.getItemsList());
        stock.addItem(new ArrayList<>(List.of(computer, mouse, bar)));
        System.out.println("Добавили коллекцию: " + stock.getItemsList());
        List<Item> evenItems = stock.getEvenItems();
        System.out.println("Четные элементы: " + evenItems);
        System.out.println("_____________________________");
        System.out.println(stock.getItemsList());
        Item itemIndex = stock.getItemIndex(4);
        System.out.println("Вещь по индексу: " + itemIndex);
        System.out.println(stock.getItemsList());
        System.out.println("_____________________________");
        stock.removeItems();
        System.out.println("Удалили все вещи кроме последней: " + stock.getItemsList());
    }
}
