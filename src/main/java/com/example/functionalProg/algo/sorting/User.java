package com.example.functionalProg.algo.sorting;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Comparator;

@Data
public class User implements Comparable<User>{
    private String fName;
    private String lName;
    private int age;

    User(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {

        return this.age - o.age;
    }

    Comparator lastNameComapator =  Comparator.comparing(User::getFName );

}
