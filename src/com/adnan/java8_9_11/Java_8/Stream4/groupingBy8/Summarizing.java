package com.adnan.java8_9_11.Java_8.Stream4.groupingBy8;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Summarizing {
    public static void main(String[] args) {
        List<Double> salaries = new ArrayList<>();
        salaries.add(1000.00);
        salaries.add(6000.00);
        salaries.add(4000.00);
        salaries.add(8000.00);
        salaries.add(9000.00);
        DoubleSummaryStatistics collect = salaries.stream().collect(Collectors.summarizingDouble((salary) -> salary));
        System.out.println(collect.getAverage());
        System.out.println(collect.getMax());
        System.out.println(collect.getSum());
    }
}
/*
Now if we want average,sum,max,min,count of all salaries we have a method summarizingDouble(),summarizingInt()
and many more in collectors class which returns Double'SummaryStatistics' so we can perform all operations
with the return value.
 */
