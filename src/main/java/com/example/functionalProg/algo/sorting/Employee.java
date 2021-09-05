package com.example.functionalProg.algo.sorting;

import lombok.Data;

import java.util.Comparator;

@Data
public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private int age;
    private long salary;

    public Employee() {
    };

    public Employee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int compareTo(Employee e) {
        return this.id - e.id;
    };


    public Comparator<Employee> salaryComparator =  Comparator.comparing(Employee::getSalary);

    public Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);

    public Comparator<Employee> ageComparator = Comparator.comparingInt(Employee::getAge);


}