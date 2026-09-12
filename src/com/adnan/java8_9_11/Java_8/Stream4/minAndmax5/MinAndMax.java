package com.adnan.java8_9_11.Java_8.Stream4.minAndmax5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinAndMax {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"Shaik",5000.00));
        empList.add(new Employee(2,"Syed",8000.00));
        empList.add(new Employee(3,"Khan",7000.00));

        //get emp with least salary
        String name = empList.stream().min(Comparator.comparingDouble(e->e.getSalary())).get()
                .getName();
        System.out.println(name);

        int id = empList.stream().min(Comparator.comparingInt(e->e.getId())).get().getId();
        System.out.println(id);

        //get emp with MAX salary
        String name1 = empList.stream().max(Comparator.comparingDouble(e->e.getSalary())).get()
                .getName();
        System.out.println(name1);


    }
}

/*
min() and max() both takes comparator as argument and returns an optional class so .get() is
required
 */
