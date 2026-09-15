package com.adnan.java8_9_11.Java_8.LocalDateTime6;

import java.time.Duration;
import java.time.LocalDateTime;

public class LocalDate {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.of(2023,9,5,12,45);
        LocalDateTime d1 = LocalDateTime.now();
        System.out.println(d1);
        System.out.println(d);
        Duration d2 = Duration.between(d,d1);
        System.out.println(d2.toDays());

    }
}
/*
LocalDateTime is the class introduced in Java 8 to simplify getting date and time and
to easily access date and time
->LocalDateTime class is final so we cannot inherit this class and its constructor is also
private so we cannot create its object directly so there is a static method called  of()
with the help of which we can create object of this class
->To get current time we have a method .now()
->To get difference between two days we have Duration class which have many static methods
to get duration between two dates like .toDays(),.toHours(),.toMinutes() e.t.c...
 */
