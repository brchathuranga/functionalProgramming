package com.example.functionalProg.designPatterns.singelton;


//https://udaraliyanage.wordpress.com/2014/01/15/singleton-pattern-inside-out-java/

/*
https://stackoverflow.com/questions/15019306/regarding-static-holder-singleton-pattern

This pattern is beneficial for at least 3 reasons:
1. Static factory
2. Lazy initialization
3. Thread safe

The JVM defers initializing the InstanceHolder class until it is actually used,
 and because the Singleton is initialized with a static initializer,
 no additional synchronization is needed.
 The first call to getInstance by any thread causes InstanceHolder to be loaded and initialized,
 at which time the initialization of the Singleton happens through the static initializer.

Static holder pattern is also considered as the smartest replace for Double-check-locking antipattern.

 */

public class StaticHolder {

    private int index = 44;

    private StaticHolder() {
    }
    private static class InstanceHolder {
        public static StaticHolder instance = new StaticHolder();
    }
    public static StaticHolder getInstance() {
        return InstanceHolder.instance;
    }

    public int getIndex() {
        return index;
    }

}


class SingletonDemo {

    public static void main(String[] args) {

        StaticHolder jcl = StaticHolder.getInstance();
        System.out.println(jcl.getIndex());
    }

}