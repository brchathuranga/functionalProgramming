package com.example.functionalProg.ex1;


import java.util.List;

public class FilterMap {

    public static void main(String[] args) {

        // printAllStrings(List.of("Spring", "Spring Boot", "Docker", "Kubernetes", "Spring Security", "AWS", "PCF"));
       // printStringsContainsWord(List.of("Spring", "Spring Boot", "Docker", "Kubernetes", "Spring Security", "AWS", "PCF"));
      //  printStringAtLeastFourChar(List.of("Spring", "Spring Boot", "Docker", "Kubernetes", "Spring Security", "AWS", "PCF"));
        printNumOfChars(List.of("Spring", "Spring Boot", "Docker", "Kubernetes", "Spring Security", "AWS", "PCF"));
    }

    private static void printAllStrings(List<String> strings) {
        strings.stream()
                .forEach(System.out::println);
    }

    private static void printStringsContainsWord(List<String> strings) {
        strings.stream()
                .filter(word -> word.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printStringAtLeastFourChar(List<String> strings) {
        strings.stream()
                .filter(word -> word.length() >= 4)
                .forEach(System.out::println);
    }

    private static void printNumOfChars(List<String> strings) {
        strings.stream()
                .map(word -> word + " -> "+  word.length())
                .forEach(System.out::println);
    }


}
