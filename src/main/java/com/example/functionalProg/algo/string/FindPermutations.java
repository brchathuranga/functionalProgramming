package com.example.functionalProg.algo.string;

public class FindPermutations {

    public static void main(String[] args) {
        String s = "abc";
        permutation("", s);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++) {
                String prfx = prefix + str.charAt(i);
                String word = str.substring(0, i) + str.substring(i + 1, n);
                permutation(prfx, word);
            }
        }
    }
}
