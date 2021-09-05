package com.example.functionalProg.algo.sorting;

import java.util.Arrays;

public class DriverClass {

    public static void main(String[] args) {

        //sorting custom object array
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);

        //Arrays.sort(empArr);

       // Arrays.stream(empArr).forEach(System.out::println);
        //Arrays.sort(empArr, new Employee().ageComparator);
        //Arrays.sort(empArr, new Employee().nameComparator);
        //Arrays.sort(empArr, new Employee().salaryComparator);
        //Arrays.stream(empArr).forEach(System.out::println);

        User[] userArr = new User[4];
        userArr[0] = new User("Ab", "Mikey", 36);
        userArr[1] = new User("B", "Arun", 29);
        userArr[2] = new User("AC", "Lisa", 35);
        userArr[3] = new User("D", "Pankaj", 32);

            Arrays.sort(userArr);
        Arrays.stream(userArr).forEach(System.out::println);








    }

}
