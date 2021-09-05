package com.example.functionalProg.designPatterns.singelton;

// Eager initialization
public class BasicSingelton {


    private BasicSingelton() {
    }

    private static final BasicSingelton INSTANCE = new BasicSingelton();

    private int index = 77;

    public static BasicSingelton getInstance() {
        return INSTANCE;
    }

    public int getIndex() {
        return index;
    }
}


class Demo {

    public static void main(String[] args) {

        BasicSingelton bs = BasicSingelton.getInstance();

        System.out.println( bs.getIndex());

    }




}
