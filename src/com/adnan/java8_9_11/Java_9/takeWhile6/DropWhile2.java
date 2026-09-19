package com.adnan.java8_9_11.Java_9.takeWhile6;

import java.util.ArrayList;
import java.util.List;

public class DropWhile2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(15);
        list.add(30);
        list.add(40);
        list.add(50);

        list.stream().skip(2).forEach(i-> System.out.println(i));
        System.out.println("---Drop while---");
        list.stream().dropWhile(i->i%2==0).forEach(i-> System.out.println(i));

    }
}
/*
dropwhile() is similar to skip method it doesn't consider elements in collection till the
condition is true then once condition becomes false it takes all elements
 */
