package com.adnan.java8_9_11.Java_11.StringMethods2;

public class Lines4 {
    public static void main(String[] args) {
        String s1 = "Java \n\r is a \n perfect Language";
        s1.lines().forEach((s)-> System.out.println(s));
    }
}
/*
lines()
lines() method is a bit same as split() method but lines() method return a Stream
lines method perfectly seperates delimiters like \n and \r

//var
in java 10 local variable type reference topic got introduced where we can declare
variables using keyword called as var a = "Ad"; var b =10;
but this is limited to only local variables inside methods.
 */
