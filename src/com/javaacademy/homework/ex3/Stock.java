package com.javaacademy.homework.ex3;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private final List<Item> itemsList = new ArrayList<>();

    public Stock() {
    }

    public List<Item> getItemsList() {
        return itemsList;
    }

    public void addItem(Item item) {
        itemsList.add(item);
    }

    public void addItem(List<Item> items) {
        itemsList.addAll(items);
    }

    public List<Item> getEvenItems() {
        List<Item> evenItems = new ArrayList<>();
        for (Item item : itemsList) {
            if (itemsList.indexOf(item) % 2 == 0) {
                evenItems.add(item);
            }
        }
        return evenItems;
    }

    public Item getItemIndex(int index) {
        return itemsList.remove(index);
    }

    public void removeItems() {
        itemsList.subList(0, itemsList.size() - 1).clear();
    }
}
