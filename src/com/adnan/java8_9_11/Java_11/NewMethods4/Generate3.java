package com.adnan.java8_9_11.Java_11.NewMethods4;

import java.util.Random;
import java.util.stream.Stream;

public class Generate3 {
    public static void main(String[] args) {
        Stream.generate(()->5).limit(5).forEach((i)-> System.out.println(i));

    }
}
/*
generate() takes a supplier we can pass any supplier like getting random values etc..
 */
