package com.adnan.java8_9_11.Java_9.tryWithResource5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryWithResourceJava7 {
    public static void main(String[] args) throws FileNotFoundException {

        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\SHAIK IDREES\\Downloads\\Telegram Desktop\\Java 8 Notes.pdf"));) {
            System.out.println(br.lines());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        //in java 7,8 this is not allowed.
        //BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\SHAIK IDREES\\Downloads\\Telegram Desktop\\Java 8 Notes.pdf"));
        //try(b1)
    }
}
/*
Try with resource
If any class or interface directly or indirectly implementing AutoClosable Interface then it is
mandatory to close it in finally block.
for example to make a DB Connection we use Connection class which implements AutoClosable interface
so after completing work win try catch block we have to specifically write finally block after try-catch
to close the connection.but if we forget to close connection in try-catch block then resource will
waste lot f memory so its mandatory to close but we may forget to close it.
So to eliminate this TryWithResource has been introduced in java 7 where we declare the resource initialization
inside the brackets of try block.
->But in java 7 we cannot define the resource as local variable and use directly variable name in
brackets of try block.
 */
