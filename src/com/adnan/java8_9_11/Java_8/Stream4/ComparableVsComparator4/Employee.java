package com.adnan.java8_9_11.Java_8.Stream4.ComparableVsComparator4;

public class Employee implements Comparable<Employee> {
    private String name;
    private int empId;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee o) {
        return this.empId - o.empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }
}

