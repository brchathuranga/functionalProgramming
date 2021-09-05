package com.example.functionalProg.algo.string;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    // https://stackoverflow.com/questions/15045640/how-to-check-if-two-words-are-anagrams

    public static void main(String[] args) {
        //System.out.println(isAnagram("abcd", "dcba"));
        System.out.println(isAna("abcd","dcab"));
    }

    static boolean isAna(String str1, String str2) {
        char[] word1 = str1.toCharArray();
        char[] word2 = str2.toCharArray();

        Map<Character, Integer> lettersInWord1 = new HashMap<>();

        for (char c : word1) {
            int count = 1;
            if (lettersInWord1.containsKey(c)) {
                count = lettersInWord1.get(c) + 1;
            }
            lettersInWord1.put(c, count);
        }

        for (char c : word2) {
            int count = -1;
            if (lettersInWord1.containsKey(c)) {
                count = lettersInWord1.get(c) - 1;
            }
            lettersInWord1.put(c, count);
        }

        for (char c : lettersInWord1.keySet()) {
            if (lettersInWord1.get(c) != 0) {
                return false;
            }
        }
        return true;
    }

    /*    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }*/

}
