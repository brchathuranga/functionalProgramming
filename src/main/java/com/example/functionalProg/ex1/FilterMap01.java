package com.example.functionalProg.ex1;


import java.util.List;

public class FilterMap01 {

    public static void main(String[] args) {

        System.out.println("test");

        printEvenNumbers(List.of(1, 2, 3, 4, 5, 6, 7));
       // printOddNumbers(List.of(1, 2, 3, 4, 5, 6, 7));


    }


    public static void printEvenNumbers(List<Integer> list) {
        list.stream().
                filter(num -> num % 2 == 0).
                map(num -> num * num)
                .forEach(System.out::println);
    }

    public static void printOddNumbers(List<Integer> list) {
        list.stream().
                filter(num -> num % 2 != 0).
                forEach(System.out::println);
    }



}
