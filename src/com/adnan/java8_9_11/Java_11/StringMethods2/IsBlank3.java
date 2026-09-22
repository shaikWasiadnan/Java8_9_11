package com.adnan.java8_9_11.Java_11.StringMethods2;

public class IsBlank3 {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "        ";
        System.out.println(s1.isBlank());
        System.out.println(s2.isBlank());
    }
}
/*
isBlank()
isBlank() method checks wheather the string length == 0 or string only contains whitespaces
then it returns true.
 */
