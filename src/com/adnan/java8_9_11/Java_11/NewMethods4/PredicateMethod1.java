package com.adnan.java8_9_11.Java_11.NewMethods4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMethod1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(23);
        list.add(30);
        list.add(37);
        list.stream().filter((i)->i%2!=0).forEach(i-> System.out.println(i));
        list.stream().filter(Predicate.not(i->i%2==0)).forEach(i-> System.out.println(i));
    }
}
/*
In java 11 in predicate interface we got new Static method called as not()
which takes a predicate and returns a Predicate so instead of using ! (negation)
we can use Predicate.not() static method of Predicate interface
 */
