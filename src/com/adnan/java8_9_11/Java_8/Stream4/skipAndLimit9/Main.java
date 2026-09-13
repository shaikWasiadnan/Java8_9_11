package com.adnan.java8_9_11.Java_8.Stream4.skipAndLimit9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(8);
        list.add(9);
        list.add(6);
        list.add(4);
        List<Integer> collect = list.stream().limit(4).collect(Collectors.toList());
        System.out.println(collect);
        //give me the second largest number
        List<Integer> collect1 = list.stream().sorted(Comparator.reverseOrder())
                .limit(2).skip(1).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
/*
skip() and limit() takes long value skip skips the number of records mentioned
limit will limit our collection to the number provided.
 */
