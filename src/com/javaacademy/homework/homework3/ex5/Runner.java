package com.javaacademy.homework.homework3.ex5;

public class Runner {
    public static void main(String[] args) {
        Ruler<Boat> boatRuler = Boat::getLength;
        Boat boat = new Boat(225);
        int lengthBoat = boatRuler.apply(boat);
        System.out.println(lengthBoat);

        Ruler<Animal> animalRuler = (animal) -> animal.getLengthBody() + animal.getLengthTail();
        Animal tiger = new Animal(160, 100);
        int lengthTiger = animalRuler.apply(tiger);
        System.out.println(lengthTiger);
    }
}
