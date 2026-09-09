package com.adnan.java8_9_11.Java_8.Lambda2.PredefinedFunctionalInterfaces2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Predicate<Boolean> t1 = (t)->true;
        Function<String,String> t2 = (t)->t;
        Consumer<String> t3 =(a)-> System.out.println("printing "+a);
        Supplier<String> t4 = ()->"a";

        t2.apply("Adnan");
        t3.accept("wasi");
    }
}

/*
Here instead of creating interfaces and then using lambda to use abstract methods of inside interface
we can use predefined Functional interfaces like Predicate,Function,Consumer,Supplier

this will reduce our code also when compared with interface+lambda
 */
