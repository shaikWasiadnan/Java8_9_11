package com.adnan.java8_9_11.Java_8.Stream4.FlatMap10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<>();
        names1.add("Shaik");
        names1.add("wasi");
        names1.add("Adnan");
        List<String> names2 = new ArrayList<>();
        names2.add("Md");
        names2.add("sameer");
        names2.add("Ahmed");

        List<List<String>> flatNames = new ArrayList<>();
        flatNames.add(names1);
        flatNames.add(names2);
        //with java 8
        List<String> result = flatNames.stream().flatMap((list)->list.stream())
                .collect(Collectors.toList());
        System.out.println(result);

        //without java 8
        List<String> result1 = new ArrayList<>();
        for(List<String> list : flatNames){
            for(String name : list){
                result1.add(name);
            }
        }
        System.out.println(result1);
    }
}
/*
map() : map method has one to one mapping it takes function as argument and takes one input and
returns one output

flatMap():flatMap has one to many mapping it takes function as argument and takes one input returns
many output. if we have a requirement to flatten the collection means to flat Collection<Collection<?>>
into Collection<?> then we will go with flatMap.
 */
