package com.adnan.java8_9_11.Java_8.Stream4.sorted6;


import java.util.*;
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

        int[] arr = {6,7,1,82,75,91};
        //get 2nd smallest number
        Arrays.stream(arr).sorted().limit(2).skip(1).forEach(res-> System.out.println(res));
        //get 2nd Highest number
        Arrays.stream(arr).boxed().sorted((a,b)->Integer.compare(b,a))
                .limit(2).skip(1).forEach((res)-> System.out.println(res));

        //get average salary
        DoubleSummaryStatistics c = empList.stream().collect(Collectors.summarizingDouble(e->e.getSalary()));
        System.out.println(c.getAverage());
        Double c1 = empList.stream().mapToDouble(e->e.getSalary()).average().orElse(0.0);
        System.out.println(c1);
    }
}
/*
sorted() is also an intermediate method in Stream interface
sorted takes comparator if COMPARABLE not present in implementation class

 */
