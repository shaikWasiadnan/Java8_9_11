package com.adnan.java8_9_11.Java_8.InterfaceChanges1;

public interface Test {
    void add();
    void subtract();

    default void print(){
        System.out.println("Currently inside Interface");
    }

    static void abc(){
        System.out.println("iam inside static method of Test Interface");
    }

}
