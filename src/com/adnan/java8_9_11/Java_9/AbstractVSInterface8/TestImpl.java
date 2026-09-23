package com.adnan.java8_9_11.Java_9.AbstractVSInterface8;

public class TestImpl implements Test1{
    public final int var;

    public TestImpl(int var) {
        this.var = var;
    }

    public static void main(String[] args) {
        System.out.println(Test1.interfaceVar);
        //Test1.interfaceVar = 20; //compilation error
        TestImpl test2 = new TestImpl(80);
        TestImpl test3 = new TestImpl(40);
        System.out.println(test2.var);
        System.out.println(test3.var);
    }
}
/*
As from java 9 we can WRITE everything in interface which we can write inside abstract class like
In abstract class  we can write:
abstract methods,non-abstract methods,static methods,private methods.
In Interface we can write:
abstract methods,non-abstract methods,static methods,private methods.

Differences :
1)Multiple Inheritance is not possible using abstract class.it is possible using interface
2)if using Functional interface we can write lambda ,but not possible in abstract class.
/////   IMPORTANT ONE /////
3)Abstract class work on state of an object where as Interface dont have any object.
Example the varibles declared inside interface are public static final once declared
inside interface in implementation class we cannot change it.
But when using abstract class if we declare final variable and donot initialize there (BLANK FINAL VARIABLE)
then initialize in constructor then every object hasits own final variable.
 */


