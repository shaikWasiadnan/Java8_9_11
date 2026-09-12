package com.adnan.java8_9_11.Java_8.Stream4.filter2;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(26);
        list.add(30);
        list.stream().filter(i->i%2==0).forEach(res-> System.out.println(res));
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1","Shaik"));
        employeeList.add(new Employee("1","Wasi"));
        employeeList.add(new Employee("1","Sameer"));

        employeeList.stream().filter(empObj->empObj.getName().startsWith("S"))
                .forEach(res-> System.out.println(res.getName()));
    }
}

/*
filter() :
filter() is a method present in collection interface which takes Predicate as an argument

takes one input and returns boolean value. filter() is a intermediate method
so it doesn't returns anything till a terminal operation is called upon filter.

forEach() is a terminal method which will make my stream to return something.
forEach(Consumer<>)
 */
