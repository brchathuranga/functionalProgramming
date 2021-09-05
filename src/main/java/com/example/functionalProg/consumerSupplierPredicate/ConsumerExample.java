package com.example.functionalProg.consumerSupplierPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> consumer = arg -> {
            System.out.println(arg);
        };
        Stream<String> cities = Stream.of("abc", "def", "ghi");

        cities.forEach(consumer);
        whenNamesPresentUseBothConsumer();
    }


    public static void whenNamesPresentUseBothConsumer() {
        List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");

        Consumer<List<String>> upperCaseConsumer = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i).toUpperCase());
            }
        };
        Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);

        upperCaseConsumer.andThen(printConsumer).accept(cities);
    }


}
