package com.example.functionalProg.algo.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {


    public static void main(String[] args) {

        String s = "samlstalo";
        findDuplicates(s).forEach(System.out::println);

    }

    private static List<Character> findDuplicates(String word) {

        char arr[] = word.toCharArray();
        List<Character> dupList = new ArrayList<>();
        Set<Character> set = new HashSet<>();

        for (char c : arr) {
            if (set.contains(c)) {
                dupList.add(c);
            } else {
                set.add(c);
            }
        }
        return dupList;
    }


}
