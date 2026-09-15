package com.adnan.java8_9_11.Java_8.MethodConstructorReference8;

public class MCReference {
    public static void main(String[] args) {
        //using lambda
        Test1 t = ()-> System.out.println("Printing display method");
        t.display();
        //using method reference
        Test1 t1 = MCReference::display;
    }
    static void display(){
        System.out.println("Printing display method inside class");
    }
}
/*
Method and constructor reference is a shorter way to write lambda expression
when our lambda is doing nothing except passing the input arguments to another
method we can directly use method reference using
for static methods :  className::methodName
for instance methods: Object::methodName

if our lambda is creating objects like ()->new ArrayList<>();
then we can go with condtructor reference using className::new
 */