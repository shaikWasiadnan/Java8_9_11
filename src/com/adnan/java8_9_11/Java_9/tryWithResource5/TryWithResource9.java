package com.adnan.java8_9_11.Java_9.tryWithResource5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryWithResource9 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\SHAIK IDREES\\Downloads\\Telegram Desktop\\Java 8 Notes.pdf"));
        try(br1){
            System.out.println("Hi");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

/*
in java 9 we can directly pass variable name in brackets

with try with resource we do not need explicit finally block to close the connection or
to close any resource try with resource block will automatically calls close method which
is present in AutoClosable Interface.
 */
