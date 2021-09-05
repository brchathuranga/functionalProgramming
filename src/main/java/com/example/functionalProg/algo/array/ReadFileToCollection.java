package com.example.functionalProg.algo.array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFileToCollection {

    public static void main(String[] args) {

        try {
            readFileToCollection();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void readFileToCollection() throws FileNotFoundException {

        Scanner s = new Scanner(new File("C:\\Users\\RuwanChathuranga\\Documents\\namelist.txt"));
        ArrayList<String> list = new ArrayList<>();
        while (s.hasNextLine()) {
            list.add(s.nextLine());
        }
        s.close();

        System.out.println("File Size: " + list.size());
        list.stream()
                .forEach(System.out::println);
    }
}
