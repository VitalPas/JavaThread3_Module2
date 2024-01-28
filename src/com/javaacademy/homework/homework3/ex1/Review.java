package com.javaacademy.homework.homework3.ex1;

import java.time.LocalDateTime;

public class Review {
    private final int id;
    private final String text;
    private int countLike;
    private final LocalDateTime localDateTime;

    public Review(int id, String text, int countLike, LocalDateTime localDateTime) {
        this.id = id;
        this.text = text;
        this.countLike = countLike;
        this.localDateTime = localDateTime;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getCountLike() {
        return countLike;
    }

    public void setCountLike(int countLike) {
        this.countLike = countLike;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", countLike=" + countLike +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
