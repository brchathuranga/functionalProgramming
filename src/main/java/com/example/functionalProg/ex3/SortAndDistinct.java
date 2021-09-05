package com.example.functionalProg.ex3;

import java.util.List;

public class SortAndDistinct {

    public static void main(String[] args) {
        printDistinctAndSorted(List.of("Spring", "Spring Boot", "Docker", "Kubernetes", "Spring Security", "AWS", "PCF", "PCF"));
    }


    private static void printDistinctAndSorted(List<String> list) {
        list.stream().distinct().sorted().forEach(System.out::println);

    }

}