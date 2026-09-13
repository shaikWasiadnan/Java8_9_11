package com.adnan.java8_9_11.Java_8.Stream4.groupingBy8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        List<String> names =new ArrayList<>();
        names.add("wasi");
        names.add("wasi");
        names.add("wasi");
        names.add("Adnan");
        names.add("wasi");
        names.add("Adnan");
        names.add("Shaik");
        Map<String, Long> collect = names.stream().collect(Collectors.groupingBy((name) -> name, Collectors.counting()));
        System.out.println(collect);
    }
}
/*
groupingBy():

groupingBy() is a method present in Collectors class which does same work like group by in SQL
ex : select name,count(*) from employees groupBy name;

groupingBy() takes a Function as argument
 */
