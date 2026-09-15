package com.adnan.java8_9_11.Java_8.OptionalClass5;

public class Optional {
    public static void main(String[] args) {
        int op1 = Optional.of(1);
    }

    private static int of(int i) {
        return i;
    }
}
/*
Optional class got introduced in java 8 to handle null pointer Exception
whenever we are getting something from DB or somewhere else then there is a
chance that no value exist and we can get null value then we will directly do
Operation on null value we will get null pointer Exception.

Optional is a class which is final so we cannot extend it and its constructor is also
private so we cannot create direct object of Optional class so to create object of Optional
class we have static methods such as of() and ofNullable() which helps in creating
object of optional class.

Optional class is like a box when we get the return value it can contain any value
inside it or there is a chance of no value and null present inside the box

so after getting we need to use  isPresent() method on box if it returns true
then we can do operations else we cannot

to get the value from the box we use .get() method.
->We can also use Optional class as return type for userdefined methods.
 */
