package com.adnan.java8_9_11.Java_9.Immutability4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java8Immutability {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        list.add("Sunday");
        list = Collections.unmodifiableList(list);
        //gives runtimeException
        //list.add("abc");
        //list.remove(1);
    }
}
/*
List is a part of Collection interface whose main purpose is to store as much as
same type of elements without declaring its size.
But if we want to make any Collection/(list here) immutable means size should be fixed no one should add or
remove anything from already declared list then in java 8 in Collections class
we got a static method called unmodifiableList(),unmodifiableMap() and for all collections these
methods got created.
Usecase:
When we only want lets say week days to appear in my dropdown and i dont want someone
to come and add something else or only months of year etc..
 */
