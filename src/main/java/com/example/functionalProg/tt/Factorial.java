package com.example.functionalProg.tt;

public class Factorial {

    final static int NUM_FACTS = 10;
    public static void main(String[] args){
        for(int i = 0; i < NUM_FACTS; i++)
            System.out.println( i + "! is " + factorial(i));
    }

    public static int factorial(int n){ int result = 1;
        for(int i = 1; i <= n; i++)
            result = result * i;
        return result;
    }
}