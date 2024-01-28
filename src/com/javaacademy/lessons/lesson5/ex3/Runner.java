package com.javaacademy.lessons.lesson5.ex3;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Student student1 = new Student("Molodyko", 31);
        Student student2 = new Student("Ivanov", 29);
        Student student3 = new Student("Petrov", 35);
        Student student4 = new Student("Sidorov", 40);
        Student student5 = new Student("Sidorov", 40);

        //Создание списка студентов без сортировки по возрасту
        HashSet<Student> students = new HashSet<>();
        students.addAll(List.of(student1, student2, student3, student4, student5));
        System.out.println(students);
        System.out.println("___________________________________________");

        //Сравнение студентов по возрасту
        Comparator<Student> comparator = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        //Создание коллекции которая хранит в себе уникальных студентов (на основе name),
        //при этом происходит сортировка по возрасту
        TreeSet<Student> treeSet = new TreeSet<>(comparator);
        treeSet.addAll(students);
        System.out.println(treeSet);
        System.out.println("1___________________________________________");

        //Создание студентов с реализованным интерфейсом Comparable
        StudentComparable studentComp1 = new StudentComparable("Yuri", 20);
        StudentComparable studentComp2 = new StudentComparable("Petr", 40);
        StudentComparable studentComp3 = new StudentComparable("Fedya", 31);
        StudentComparable studentComp4 = new StudentComparable("Masha", 25);

        //Создание коллекции студент - оценка. Студенты сортируются по возрасту за счет
        //интерфейса Comparable
        TreeMap<StudentComparable, Integer> treeMap = new TreeMap<>();
        treeMap.put(studentComp1, 3);
        treeMap.put(studentComp2, 5);
        treeMap.put(studentComp3, 4);
        treeMap.put(studentComp4, 5);
        System.out.println(treeMap);
    }
}
