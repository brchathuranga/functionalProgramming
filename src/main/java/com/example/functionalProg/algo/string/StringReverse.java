package com.example.functionalProg.algo.string;

public class StringReverse {

    public static void main(String[] args) {

        String str = "abcdefgh";
        System.out.println("Reversed " + str + " to :" + reverseString(str));
    }

    private static String reverseString(String str) {

        char arr[] = str.toCharArray();
        char temp;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            ++start;
            --end;
        }
        return new String(arr);
    }
}
