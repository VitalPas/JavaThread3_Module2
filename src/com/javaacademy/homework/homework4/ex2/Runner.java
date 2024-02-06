package com.javaacademy.homework.homework4.ex2;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> words = List.of("тонь", "тополь", "боль", "рой", "стройка");

        words.stream().map(Runner::findCountO)
                .reduce(Long::sum)
                .ifPresent(Runner::result);
    }

    private static long findCountO(String text) {
        return text.chars().filter(ch -> ch == 'о').count();
    }

    private static void result(long count) {
        if (count == 0) {
            throw new RuntimeException("Not letter O");
        }
        System.out.println(count);
    }
}




