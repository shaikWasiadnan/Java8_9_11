package com.adnan.java8_9_11.Java_8.CollectionInterfaceEnhancement3.removeIf;

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

        list.removeIf((i)->i%2==0);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1","Shaik"));
        employeeList.add(new Employee("1","Adnan"));
        employeeList.add(new Employee("1","Wasi"));
        employeeList.add(new Employee("1","Ahmed"));
        employeeList.removeIf((emp)->emp.getName().startsWith("A"));

        employeeList.forEach((empObj)-> System.out.println(empObj.getEmpId()+" "+empObj.getName()));
    }
}

/*
removeIf(Predicate<>)

removeIf will remove if any condition is true
 */
