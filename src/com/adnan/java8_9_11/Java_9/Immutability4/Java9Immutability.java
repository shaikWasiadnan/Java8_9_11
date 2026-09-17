package com.adnan.java8_9_11.Java_9.Immutability4;

import java.util.List;

public class Java9Immutability {
    public static void main(String[] args) {
        List<String> days = List.of("Mon","Tue","Wed","Thurs","Fri","Sat","Sun");
        //gives runtimeException
//        days.add("abc");
//        days.remove(1);
    }
}
/*
From java 9 to create immutable Collection we got a ststic method called as of()
The arguments provided in of() method are final we cannot add or remove anything
which makes Collection/(list here) immutable
 */
