package com.adnan.java8_9_11.Java_8.ParallelStream7;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParallelStreamClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(26);
        list.add(30);
        System.out.println("Result using Stream");
        list.stream().forEach((i)-> System.out.println(i));
        System.out.println("Result using Parallel Stream");
        list.parallelStream().forEach((i)-> System.out.println(i));

        //findout time
        LocalDateTime startTime1= LocalDateTime.now();
        list.stream().map((i)->i*2).forEach((i)-> System.out.println(i));
        LocalDateTime endTime1 = LocalDateTime.now();
        long d1 = Duration.between(startTime1,endTime1).toMillis();
        System.out.println("Using Stream time taken is: "+d1);
        LocalDateTime startTime2= LocalDateTime.now();
        list.stream().map((i)->i*2).forEach((i)-> System.out.println(i));
        LocalDateTime endTime2 = LocalDateTime.now();
        long d2 = Duration.between(startTime2,endTime2).toMillis();
        System.out.println("Using Parallel Stream time taken is: "+d2);

        //forEachOrdered
        System.out.println("forEachOrdered");
        list.parallelStream().forEachOrdered((i)-> System.out.println(i));
    }
}
/*
Parallel Stream:
Parallel Stream method is also a static method which completes the task in faster time
when compared wth stream. Parallel Stream uses multiple cores present in our system and tries to so the
work in less time
->But thing to observe is stream() will give the output in the order our list elements are present.
but Parallel Stream does not give the output in the order our list elements are present.
because multiple threads work on same collection to process the result

Difference between forEach and forEachOrdered:
forEach is used in stream() to print the result as we have seen above Parallel Stream
does not give the output in the order our list elements are present. so to solve this
forEachOrdered has been introduces even multiple threads are working we will get output
as per insertion order.
 */
