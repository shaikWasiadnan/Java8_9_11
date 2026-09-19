package com.adnan.java8_9_11.Java_9.takeWhile6;

import java.util.ArrayList;
import java.util.List;

public class TakeWhile1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(15);
        list.add(30);
        list.add(40);
        list.add(50);
        list.stream().limit(2).forEach(i-> System.out.println(i));
        System.out.println("take while");
        list.stream().takeWhile(i->i%2==0).forEach(System.out::println);
    }
}
/*
TakeWhile :
takewhile() is similar to limit() method limit() method was introduced in java 8 which can only take
long values where as takewhile() will take Predicate takewhile processes the data of collection
till the condition is true.
Ex:if we have 1000 employees stored in a list and i want to get only employees whose salery
is less than equal to 50000. then here i dont have any idea how many employees meet this condition
then after sorting employees based on salary we only want employees who meet our condition then
we can go with takewhile(Predicate).
 */
