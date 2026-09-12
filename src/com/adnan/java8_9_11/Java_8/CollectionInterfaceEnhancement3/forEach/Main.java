package com.adnan.java8_9_11.Java_8.CollectionInterfaceEnhancement3.forEach;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //Before Java 8 code
        for(int i=0;i<list.size();i++){
            System.out.println("current number is: "+list.get(i));
        }
        //        From java 8
        list.forEach(i-> System.out.println(i));

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("1","Shaik"));
        empList.add(new Employee("2","wasi"));
        empList.add(new Employee("3","Adnan"));

        empList.forEach(obj->{
            System.out.println("employee id is: "+obj.getEmpId());
            System.out.println("employee name is: "+obj.getName());
        });
    }
}
/*
forEach(consumer<?>) :
forEach method takes consumer as input which can e used to traverse on collection
easily
 */
