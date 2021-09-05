package com.example.functionalProg.algo.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Practice {

    public static void main(String[] args) {

        //sorting custom object array
        List<Employee> emps = new ArrayList<>();


        Employee e1 = new Employee(10, "Mikey", 25, 10000);
        Employee e2 = new Employee(20, "Arun", 29, 20000);
        Employee e3 = new Employee(5, "Lisa", 35, 5000);
        Employee e4 = new Employee(1, "Pankaj", 32, 50000);

        emps.add(e1);
        emps.add(e2);
        emps.add(e3);
        emps.add(e4);


        emps.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);


    }

}
