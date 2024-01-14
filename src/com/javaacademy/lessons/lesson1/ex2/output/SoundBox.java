package com.javaacademy.lessons.lesson1.ex2.output;

public class SoundBox implements Output {
    @Override
    public void outputInformation() {
        System.out.println("Колонка играет музыку");
    }

    public void changeVolume() {
        System.out.println("Изменение уровня звука");
    }
}
