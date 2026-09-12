package com.adnan.java8_9_11.Java_8.Stream4.ComparableVsComparator4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(3,"SHAIK"));
        employeeList.add(new Employee(1,"WASI"));
        employeeList.add(new Employee(2,"SAMEER"));

//        Collections.sort(employeeList);
//        System.out.println("Sorted used Comparable");
//        System.out.println(employeeList);
        System.out.println("-----------------");
        Collections.sort(employeeList,(a,b)->b.getName().compareTo(a.getName()));
        System.out.println(employeeList);



    }
}

/*
Comparable :
Comparable is an interface present in java.lang package
Comparable has one abstract method called as compareTo(Object o)
if we want to use Comparable then class should implement Comparable interface and override compareTo() method
Use Comparable and compareTo() if we have a standard sorting logic for all objects of one particular class
and sorting logic will be present inside the class.

Comparator:
Comparator is an interface present inside java.util package
Comparator has  abstract method compare(Object a,Object b) and does sorting based on the logic given
we can do customized sorting by using Comparator and we use lambda to invoke compare() method
Generally logic is present outside the class.
 */
