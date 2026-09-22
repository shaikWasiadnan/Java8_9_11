package com.adnan.java8_9_11.Java_11.StringMethods2;

public class Repeat1 {
    public static void main(String[] args) {
        String s = "Ad nan";
        String s2 = s.repeat(2);

        System.out.println(s2);
        //String s4 = s.repeat(-2);
        //String s3 = s.repeat(Integer.MAX_VALUE);
    }
}
/*
repeat() method was introduced in java 9 which repeats the given string count times
count will be provided as argument to the repeat method.
if count provided is less than 0 we will get IllegalArgumentException
if after repetation length crosses Integer.MAX_VALUE then we will get out of memory Exception

 */
