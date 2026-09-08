package com.adnan.java8_9_11.Java_8.InterfaceChanges1;

public class Main implements Test {

    public static void main(String[] args) {
        Main obj = new Main();
        obj.print();
        obj.add();
        obj.subtract();
        Test.abc();
    }

//

    @Override
    public void print(){
        System.out.println("Inside Class Print mehod");
    }

//    public void print(){
//        Test.super.print();
//    }

    @Override
    public void add() {
        System.out.println(1+2);
    }

    @Override
    public void subtract() {
        System.out.println(3-1);
    }
}

/*
From Java 1.8 we can also write Default and Static methods inside an interface
Default method use case:
For example if we have one interface and 3 implementation classes of that interface
and there are 2 methods which we only want inside one class or lets say 2 classes among three
3 implemented classes then we have to write abstract methods inside an interface and
override among  all three classes but we want only in 2 classes not in 3.

If we think we will only write those methods directly in 2 classes then we will not reuse the code
we are writing duplicate code. thats the reason we go with default methods which have body
so its our wish to override the default method or use default method present in interface

Static Method:
We cannot override static variables or methods inside implementation because static belongs to class not to object
means for static variables/methods memory will be allocated only once in stack during program start.
where as objects get stored in Heap memory. we will be using Static methods directly by using
interfaceName.static method name
 */


