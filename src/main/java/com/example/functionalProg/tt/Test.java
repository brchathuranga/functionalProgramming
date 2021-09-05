//package com.example.functionalProg.tt;
//
//import java.util.Arrays;
//
//public class Test {
//
//
//
//    public static long maxValue(int n, List<List<Integer>> rounds) {
//        // Write your code here
///*        long[] investments = new long[n + 1];
//        long maxInvestment = 0;
//
//        for (List<Integer> contribution : rounds){
//            int left = contribution.get(0);
//            int right = contribution.get(1);
//            int amount = contribution.get(2);
//
//            for(int start = left; start <= right; start++){
//                investments[start] += amount;
//                maxInvestment = Math.max(maxInvestment, investments[start]);
//            }
//        }
//
//        return maxInvestment;*/
//        long[] investments = new long[n + 1];
//        long maxInvestment = 0;
//
//        for (List<Integer> contribution : rounds){
//            int left = contribution.get(0);
//            int right = contribution.get(1);
//            int amount = contribution.get(2);
//
//            for(int start = left; start <= right; start++){
//                investments[start] += amount;
//            }
//        }
//
//        Arrays.sort(investments);
//
//        return investments[investments.length-1];
//
//    }
//
//
//
//
//}
