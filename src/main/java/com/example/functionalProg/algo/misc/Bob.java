package com.example.functionalProg.algo.misc;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Bob {

    public static void main(String[] args) {
        test();

       /* int maxWeight = 10;
        int countOfItems = 4;
        int[] prices = {5, 3, 10, 4};
        int[] weights = {4, 2, 8, 8};

        int[][] matrics = new int[countOfItems + 1][maxWeight + 1];
        IntStream.range(0, maxWeight + 1).forEach(r -> matrics[0][r] = 0);
        IntStream.range(0, countOfItems + 1).forEach(c -> matrics[c][0] = 0);

        for (int item = 1; item <= countOfItems; item++) {
            for (int capacity = 1; capacity <= maxWeight; capacity++) {
                int maxValWithoutCurr = matrics[item - 1][capacity];
                int maxValWithCurr = 0;
                int weightOfCurr = weights[item - 1];
                if (capacity >= weightOfCurr) {
                    maxValWithCurr = prices[item - 1];
                    int remainingCapacity = capacity - weightOfCurr;
                    maxValWithCurr += matrics[item - 1][remainingCapacity];
                }
                matrics[item][capacity] = Math.max(maxValWithoutCurr, maxValWithCurr);
            }
        }
        System.out.println(matrics[countOfItems][maxWeight]);*/
    }

   static void test(){
        String line = "10 5";

        int index = 0;
        //int maxWeight = 0;
        int countOfItems = 0;
        int[] prices = new int[0];
        int[] weights = new int[0];
        while (index < 1000) {
            int[] inputs = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            if (index == 0) {
              //  maxWeight = inputs[0];
                countOfItems = inputs[1];
                prices = new int[countOfItems];
                weights = new int[countOfItems];
            } else {
                prices[index] = inputs[0];
                weights[index] = inputs[1];
            }
            index += 1;
        }


    }



}
