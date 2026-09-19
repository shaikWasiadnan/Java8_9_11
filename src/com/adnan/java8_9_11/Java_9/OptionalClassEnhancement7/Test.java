package com.adnan.java8_9_11.Java_9.OptionalClassEnhancement7;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Optional<Integer> o = Optional.ofNullable(null);
        o.ifPresent(i-> System.out.println(i));
        Optional<Integer> o1 = Optional.ofNullable(13);
        o1.ifPresent(i-> System.out.println(i));
        o.ifPresentOrElse(i-> System.out.println(i),()-> System.out.println("Value is null"));
        o1.ifPresentOrElse(i-> System.out.println(i),()-> System.out.println("Value is null"));
        int val0 =o.orElseGet(()->{
            System.out.println("value is not present");
            System.out.println("we are inside or Else Get");
            return 143;
        });
        int val = o1.orElseGet(()->{
            System.out.println("value is not present");
            System.out.println("we are inside or Else Get");
            return 143;
        });
        System.out.println(val);

    }
}
/*
Optional class got some new methods such as ifPresent(Consumer),
ifPresentOrElse(Consumer,Runnable) if value is present then cosumer will be picked or else Runnable.
orElseGet() which takes SUPPLIER;

 */
