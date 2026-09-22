package com.adnan.java8_9_11.Java_11.StringMethods2;

public class Strip2 {
    public static void main(String[] args) {
        String s1 = "  Ad nan  ";
        System.out.println(s1.trim());
        System.out.println(s1.strip());
        String s2 = " Was ";
        System.out.println(s2.stripLeading()); //removes leading spaces
        System.out.println(s2.stripTrailing());//removes Trailing spaces

    }
}
/*
strip()
Functionality wise strip() method is as same as trim() method whose work is to remove
whitespaces which are available before beginning and after completion of string.
Difference
trim() method uses old ASCII Value comparison to check for blank spaces whereas
strip() method uses modern technique which is being used in every programming language
to check for white spaces strip() method uses Character class whitespace() (Character.whitespace())
method to check for whitespaces.So strip() method is preferred over trim for modern java.
 */