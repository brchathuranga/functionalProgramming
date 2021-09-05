package com.example.functionalProg.consumerSupplierPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {


    public static void main(String[] args) {
        testPredicate();
    }

    public static void testPredicate() {

        List<String> list = Arrays.asList("alex", "asus", "dell", "hp");

        Predicate<String> startsWithS = str -> str.startsWith("a");

        list.stream().filter(startsWithS).forEach(System.out::println);

    }

}
