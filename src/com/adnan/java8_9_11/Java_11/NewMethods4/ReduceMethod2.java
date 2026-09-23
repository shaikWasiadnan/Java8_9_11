package com.adnan.java8_9_11.Java_11.NewMethods4;

import com.adnan.java8_9_11.Java_8.Stream4.minAndmax5.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceMethod2 {
    public static void main(String[] args) {
        //wrapper class
        int[] arr = {1,18,9,7,26};
        Arrays.stream(arr).reduce((x,y)->x*y)
                .ifPresentOrElse((res)-> System.out.println(res),()-> System.out.println("Array empty"));
        //user defined
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"Shaik",50.00));
        empList.add(new Employee(2,"Syed",80.00));
        empList.add(new Employee(3,"Khan",700.00));
        empList.stream().mapToDouble(emp-> emp.getSalary()).reduce((s1,s2)->s1*s2)
                .ifPresent((res)-> System.out.println(res));
    }
}
/*
reduce()
reduce() method can take two integers or two double or two long arguments and returns
IntOptional,DoubleOptional,LongOptional so we need to get() it using any of the Optional methods
Basically map() method will do operation single element by element from Collection.
but if we want something like doing operation on whole collection and returning only one result
then we can go with reduce() method which reduces our whole collection as single result.

//For user defined objects reduce() method will always follow map() method
generally after map method only we use reduce() method.
 */