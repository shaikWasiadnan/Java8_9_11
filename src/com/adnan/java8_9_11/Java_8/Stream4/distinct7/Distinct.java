package com.adnan.java8_9_11.Java_8.Stream4.distinct7;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        //using java 8 remove duplicates from list1
        List<Integer> collect = list1.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"Shaik",5000.00));
        empList.add(new Employee(2,"Syed",8000.00));
        empList.add(new Employee(3,"Khan",7000.00));
        empList.add(new Employee(3,"MD",7000.00));
        empList.add(new Employee(2,"VC",10000.00));

        List<Employee> collect1 = empList.stream().distinct().collect(Collectors.toList());
        System.out.println(collect1);

        Map<Integer,Employee> map = empList.stream().distinct().collect(Collectors
                .toMap((empObj)->empObj.getId(),e->e));
        System.out.println(map);
    }
}
/*
distinct():
distinct using Wrapper class:
distinct() is a intermediate method whose work is to find distinct elements/objects
above in example1 using list1 we are using Integer as a storage type so it already has
hashCode() and equals() method overriden inside integer class so it can directly find the distinct elements.

distinct using User Defined Class:
if we are using User defined class then we must override hashcode() and equals() method in User Defined Class
because java dont know exactly how to sort if we dont provide implementation.on which field sorting has
to be done we should provide in equals() and hashcode() methods.

toMap()

toMap() method is terminal operation/method which is present in Collectors class
toMap takes Function as an argument which stores key,value

 */
