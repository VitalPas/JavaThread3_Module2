package com.javaacademy.homework.homework4.ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Skyscraper wordMall = new Skyscraper("Всемирный торговый центр", 541);
        Skyscraper shanghaiTower = new Skyscraper("Шанхайская башня", 632);
        Skyscraper burjKhalifa = new Skyscraper("Бурдж-Халифа", 828);
        Skyscraper internationalFinancePinan =
                new Skyscraper("Международный финансовый центр Пинань", 599);
        Skyscraper abrajalBayt = new Skyscraper("Абрадж аль-Бейт", 601);
        Skyscraper lotteWorldCenter = new Skyscraper("Всемирный центр Лотте", 555);


        List<Skyscraper> skyscrapers = new ArrayList<>();

        skyscrapers.add(wordMall);
        skyscrapers.add(shanghaiTower);
        skyscrapers.add(burjKhalifa);
        skyscrapers.add(burjKhalifa);
        skyscrapers.add(internationalFinancePinan);
        skyscrapers.add(abrajalBayt);
        skyscrapers.add(lotteWorldCenter);

        //Убрать дубликаты
        List<Skyscraper> skyscrapersWithoutDuplicate = skyscrapers.stream().distinct().toList();

        //Вывести только первые три небоскреба.
        skyscrapersWithoutDuplicate.stream().limit(3).forEach(System.out::println);

        //Вывести самый высокий небоскреб.
        skyscrapersWithoutDuplicate.stream()
                .filter((skyscraper -> skyscraper.getHeight() == maxHeightSkyscraper(skyscrapers)))
                .toList()
                .forEach(System.out::println);

        //Вывести те небоскребы, которые выше километра.
        skyscrapersWithoutDuplicate.stream()
                .filter(skyscraper -> skyscraper.getHeight() > 1000)
                .peek(System.out::println)
                .toList()
                .stream()
                .findAny()
                .ifPresentOrElse(skyscraper -> {}, () -> System.out.println("Небоскреба выше километра нет"));

    }

    private static int maxHeightSkyscraper(List<Skyscraper> skyscrapers) {
        Comparator<Skyscraper> skyscraperComparator = Comparator.comparingInt(Skyscraper::getHeight);
        return skyscrapers.stream().max(skyscraperComparator).map(Skyscraper::getHeight).orElse(-1);
    }
}
