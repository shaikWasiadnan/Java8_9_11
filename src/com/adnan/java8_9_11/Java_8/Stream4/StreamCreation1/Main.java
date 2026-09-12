package com.adnan.java8_9_11.Java_8.Stream4.StreamCreation1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<Integer> st = Stream.of(1,2,3);

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Stream<String> st1 = list.stream();
    }
}
/*
Stream : Stream is an interface present in java introduces in java 1.8 which
has lot of methods by using these methods we can perform operations on collection

creation :

1)If we dont have any collection yet and we want to create stream then we can use
Static method of Stream interface .of() which takes variable arguments.

variable arguments:

example if we have a use case that m1() method takes 0,1,2 arguments then  like
m1(),m1(int i),m1(int i,int j) then before java 1.5 we have to create all the methods
seperately but in java 1.5 we got variable arguments feature instead of declaring all
methods we can just do :   m1(int ...a); so internally this will create an array of
declared data type here int. if we give String then String array will be created.

2)If we already have a collection then we can directly do collectionName.Stream()
so it will be converted to stream now we can do various operation on it.


 */
