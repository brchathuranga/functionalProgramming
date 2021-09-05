package com.example.functionalProg.ex3;

import java.util.Comparator;
import java.util.List;

public class SortWithComparator {

    public static void main(String[] args) {
       // printWithCustomSort(List.of("Spring", "Spring Boot", "Docker", "Kubernetes", "Spring Security", "AWS", "PCF", "PCF"));
        printTOAscendingOrder(List.of("Spring", "Spring Boot", "Docker", "Kubernetes", "Spring Security", "AWS", "PCF", "PCF"));
    }



    static void printTOAscendingOrder (List <String> list) {

        list.stream()
                .map(str -> str + " " + str.length())
                .distinct().sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }

    private static void printWithCustomSort(List<String> list) {
        System.out.println("========== PrintWithCustomSort =======");

        list.stream()
               // .filter(word -> word.length() > 8)
                .map(word -> word +" -> " +word.length())
               // .sorted(Comparator.comparing(str -> str.length()))
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);



    }


}
