package com.adnan.java8_9_11.Java_8.Stream4.sorted6;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"Shaik",5000.00));
        empList.add(new Employee(2,"Syed",8000.00));
        empList.add(new Employee(3,"Khan",7000.00));

        List<Employee> list = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(list);

        List<Employee> list1 = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println(list1);

    }
}
/*
sorted() is also an intermediate method in Stream interface
sorted takes comparator if COMPARABLE not present in implementation class

 */
