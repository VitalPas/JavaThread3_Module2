package com.javaacademy.homework.ex2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<Integer> array1 = new ArrayList<>(List.of(5, 2, 4));
        List<Integer> array2 = new ArrayList<>(List.of(7, 10));

        System.out.println(array1);
        System.out.println(array2);

        List<Integer> array3 = new ArrayList<>();
        array3.addAll(array1);
        array3.addAll(array2);
        System.out.println("Массив после записи первых двух: " + array3);
        array3.remove(3);
        System.out.println("Массив после удаления 3 элемента: " + array3);
        System.out.println("Индекс числа 10: " + array3.indexOf(10));

    }
}
