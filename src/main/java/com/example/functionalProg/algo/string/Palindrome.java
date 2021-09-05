package com.example.functionalProg.algo.string;

public class Palindrome {

    public static void main(String[] args) {
        String str = "malayalam";
        System.out.println("Is " + str + " Palindrome? : " + isPalinDrome(str));
    }

    private static boolean isPalinDrome(String str) {

        if (str.length() == 0 || str.length() == 1)
            return true;

        if (str.charAt(0) == str.charAt(str.length() - 1))
            return isPalinDrome(str.substring(1, str.length() - 1));

        return false;
    }

}
