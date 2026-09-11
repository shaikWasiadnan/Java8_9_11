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
Default methods provide Backward compatibility means:

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

UseCase of Static Method :
we can avoild creating seperate classes for utility methods and can write utility methods
inside the interface itself
For Example:Before Java 1.8 Collection interface was introduced as there was no scope to
write static/utility methods inside an interface creators created a seperate class called as
Collections which hold all the utility ethods related to all the collections

As we know ArrayList is not synchronized if we want to synchronize Arraylist we have to use
utility method present in collections class called as .synchronizeList() as there was no scope
to write these sort of methods in interface before java 1.8.
 */


