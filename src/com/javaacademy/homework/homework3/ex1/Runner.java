package com.javaacademy.homework.homework3.ex1;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        Comparator<Review> reviewComparator = (rev1, rev2) -> {
            if (rev1.getId() == rev2.getId()) {
                return 0;
            }
            if (rev1.getCountLike() == rev2.getCountLike()) {
                return rev2.getLocalDateTime().compareTo(rev1.getLocalDateTime());
            }
            return rev2.getCountLike() - rev1.getCountLike();
        };

        Review review1 = new Review(1, "Отличный товар", 200,
                LocalDateTime.of(2024, 1, 25, 13, 37));
        Review review2 = new Review(2, "Так себе товар", 100,
                LocalDateTime.of(2024, 1, 25, 16, 37));
        Review review3 = new Review(3, "Плохой товар", 100,
                LocalDateTime.of(2024, 1, 25, 13, 37));


        TreeSet<Review> reviews = new TreeSet<>(reviewComparator);

        reviews.add(review2);
        reviews.add(review1);
        reviews.add(review3);
        reviews.forEach(System.out::println);

    }
}
