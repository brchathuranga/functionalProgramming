package com.example.functionalProg.algo.array.model;

import lombok.Data;

@Data
public class User {

    private int id;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstNames='" + firstName + '\'' +
                ", lastNames='" + lastName + '\'' +
                '}';
    }
}
