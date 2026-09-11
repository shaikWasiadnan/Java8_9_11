package com.adnan.java8_9_11.Java_8.Lambda2.SimpleLambda1;

public class Main {

    public static void main(String[] args) {
        Test1 t1 = ()->true;
        Test2 t2 = (t)->t;
        Test3 t3 =(a)-> System.out.println("printing "+a);
        Test4 t4 = ()->"a";

        t2.test2Method("Adnan");
        t3.test3Method("wasi");
    }
}

/*
Lambda:
Before java 8 If we have an interface with one abstract method then we have to must
implement that interface using a class
But from java 8 we can write lambda expression so we dont have to manually create classes
for implemeting interface which have only one abstract method

for lambda interface name will act as type if we want to use those we can just do
variablename.methodname() to call that method.

But if we have a requirement lets say to create 10 functional interfaces which have only
one abstract method then writing 10 interfaces will make our Jar file heavy this is the
disadvantage to overcome this we have predefined Functional interfaces.

Benefits of Lambda :
1) Lambda enables Functional Programming means
if any method is taking reference of an Functional interface example :
public void method1(Test1);     here Test1 is an Functional interface
now if we want to pass Test1 as argument before java 8 we have to create a class which is
implementing Test1 interface then create object of that class then pass it to method1(object);

But from java8 if passed method is Functional interface then instead of creating a seperate class
we can directly write lambda in place of expression.
Example:whenever we are creating Thread then thread class takes Runnable Interface as reference
there we can directly write lambda

Thread t = new Thread(()->sout("Hello"));

2)By using Lambda we can replace anonymous classes same thread example.

 */
