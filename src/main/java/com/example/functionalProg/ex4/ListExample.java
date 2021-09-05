package com.example.functionalProg.ex4;

import java.util.List;
import java.util.stream.Collectors;

public class ListExample {

    public static void main(String[] args) {
        List<Integer> numList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        createNewListWithlengths(List.of("Spring", "Spring Boot", "Docker", "Kubernetes", "Spring Security", "AWS", "PCF", "PCF"));
        //List<Integer> newList = squareTheList(numList);
        List<Integer> newList = filterEvenNums(numList);
        newList.forEach(System.out::println);
    }

    private static void createNewListWithlengths(List<String> list) {
        List<Integer> lengthlist = list.stream()
                .map(word -> word.length())
                .collect(Collectors.toList());

        lengthlist.forEach(System.out::println);

    }

    private static List<Integer> filterEvenNums(List<Integer> list) {
        return list.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());
    }

    private static List<Integer> squareTheList(List<Integer> list) {
        return list.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
    }
}
