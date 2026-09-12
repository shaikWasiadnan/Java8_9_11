package com.adnan.java8_9_11.Java_8.Stream4.map3;

import com.adnan.java8_9_11.Java_8.Stream4.filter2.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(26);
        list.add(30);
        List<Integer> multipliedList = list.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(multipliedList);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1","SHAIK"));
        employeeList.add(new Employee("1","WASI"));
        employeeList.add(new Employee("1","SAMEER"));
        Set<String> empName = employeeList.stream().map(empObj->empObj.getName().toLowerCase())
                .collect(Collectors.toSet());
        System.out.println(empName);

    }
}

/*
map(Function<T,T>):

map() is also a intermediate method present in collection which takes a Function interface
so if we have requirement to take something as input and return something we will be
using map() method.

.collect() is an terminal operation which makes our stream to return something if we want our
result to be stored in a list then we can use  .collect(Collectors.toList())  or
if we want to return a set then    .collect(Collectors.toSet())
 */
