package com.javaacademy.homework.homework2.ex2;

import java.util.HashMap;

public class Runner {
    public static void main(String[] args) {
        Item apple = new Item("Apple");
        Item banana = new Item("Banana");
        Item orange = new Item("Orange");

        HashMap<Item, Integer> hashMap = new HashMap<>();
        hashMap.put(apple, 1);
        hashMap.put(banana, 2);
        hashMap.put(orange, 3);
        System.out.println(hashMap.get(orange));

    }
}
