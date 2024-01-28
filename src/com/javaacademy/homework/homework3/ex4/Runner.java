package com.javaacademy.homework.homework3.ex4;

public class Runner {
    public static void main(String[] args) {
        Wood wood = new Wood();
        Uranus uranus = new Uranus();

        Burning<Uranus> atomicReactor = Uranus::burn;
        Burning<Wood> boonFire = Wood::burn;
        atomicReactor.accept(uranus);
        boonFire.accept(wood);
    }
}
