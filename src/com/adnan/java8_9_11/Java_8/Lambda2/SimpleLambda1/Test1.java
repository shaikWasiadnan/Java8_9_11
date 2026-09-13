package com.adnan.java8_9_11.Java_8.Lambda2.SimpleLambda1;


@FunctionalInterface
public interface Test1 {
    boolean test1Method();
    @Override
    String toString();
    @Override
    boolean equals(Object o);

}

/*
As per defination in Functional interfaces only one abstract method should present and any number
of default and static methods can present.
But above i have 3 abstract methods but its not giving error why?
because Functional interfaces can contain "abstract methods from Object class"
they will not be counted as an abstract methods
 */
