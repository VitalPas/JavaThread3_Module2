package com.javaacademy.lessons.lesson1.ex2;

import com.javaacademy.lessons.lesson1.ex2.input.Keyboard;
import com.javaacademy.lessons.lesson1.ex2.output.Monitor;

public class AppleComputer extends Computer<Keyboard, Monitor> {
    public AppleComputer(Keyboard input, Monitor output) {
        super(input, output);
    }
}
