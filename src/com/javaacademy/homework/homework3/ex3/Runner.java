package com.javaacademy.homework.homework3.ex3;

public class Runner {
    public static void main(String[] args) {
        Divination<String> chamomile = (name) -> name.length() % 2 == 0;

        boolean result = chamomile.test("Vitaliy");
        System.out.println(result);

        Divination<Human> fortuneTeller = (human) -> human.getHeight() + human.getAge() > 210;
        Human human1 = new Human(150, 60);
        Human human2 = new Human(180, 35);

        boolean testHuman1 = fortuneTeller.test(human1);
        boolean testHuman2 = fortuneTeller.test(human2);
        System.out.println(testHuman1);
        System.out.println(testHuman2);

    }
}
