package com.example.functionalProg.ex2;

import java.util.List;

public class Reduce {


    public static void main(String[] args) {

        System.out.println("Sum");

        //calcSum(List.of(1, 2, 3, 4, 5, 6, 7));
        //findSqAndSum(List.of( 2, 3, 4));
          findSumOfOddNums(List.of(1,2,3,4,5,6,7,8,9));


    }


    public static void findSumOfOddNums(List<Integer> list) {

        int sum = list.stream()
                .filter(num -> num % 2 != 0)
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }


    public static void findSqAndSum(List<Integer> list) {
        int sum = list.stream()
                .map(num -> num * num)
                .reduce(0, Integer::sum);
        System.out.println("Sum -> " + sum);

    }

    public static void calcSum(List<Integer> list) {
        int sum = list.stream()
                //  .reduce(0, Reduce::sumUp);
         //.reduce(0, (a, b) -> a + b);
         .reduce(0, Integer::sum);
        System.out.println(sum);

    }

}
