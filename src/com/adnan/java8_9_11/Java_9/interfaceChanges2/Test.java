package com.adnan.java8_9_11.Java_9.interfaceChanges2;

public interface Test {
    void display();
    default void add(){
//        try{
//            int x = 5;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        commonLogic();
        System.out.println("Adding");
    }
    default void add1(){
//        try{
//            int x = 5;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        commonLogic();
        System.out.println("Adding method 2");
    }
    static void sub(){
        System.out.println("subtracting");
    }
    private void commonLogic(){
        try{
            int x = 5;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
/*
From java 9 we can write private methods inside an interface.
The advantage of private methods inside an interface is Code Reusability.
For example we have 2 default methods inside which we have some part of logic same
so writing same code in two different methods make our code duplicate to avoid this in class
in common what we do? we create a method which has the common logic then we call
in both the methods.
->So from java 9 we can write private methods for code reusability in default/static methods
inside an interface.
Question: We can also create another default method inside an interface for code reusability
then why private methods?
Answer:default methods can be overriden outside the interface in some implementation class
then the overriden logic will be executed rather than the main logic we provided inside interface
Thats the reason we go with private methods inside an interface so no one can override the logic.
 */
