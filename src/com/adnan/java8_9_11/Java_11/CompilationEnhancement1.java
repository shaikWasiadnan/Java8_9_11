package com.adnan.java8_9_11.Java_11;

public class CompilationEnhancement1 {
    public static void main(String[] args) {
         String s1 = "Adnan";
         String s2 = new String("Wasi");
         String s3 = "Adnan";
        String s4 = new String("Wasi");
        System.out.println(s1==s2); //false
        System.out.println(s1==s3); //true
        //== compares their memory address not the characters present inside string
        System.out.println(s2.equals(s4)); //equals() compares strings character by character.

    }
}
/*
Before java 11 if we want to run our java program from notepad and cmd then we would
needed two commands first is compilation then running program
1)javac filename.java 2)java classname    in cmd

After java 11 this has been reduced to only one command
1)java filename.java  in cmd this is internally compile the program if any errors
then it will flag directly then.

//STRING CONCEPT
There are 2 ways to create a string Object 1)String literal "" 2)new Keyword

1)String literal String s1 = "Adnan";:
In HEAP MEMORY there will be an area called String constant pool (SCP) where all string literals will
be stored lets say at first we created a string using String s1 = "Adnan";(String literal) then it will
be stored in SCP if later if we are creating again same string with String literal String s1 = "Adnan";
and refering it as s2 then JVM will check wheather does this same string exist in SCP if yes then
it will not create a new object simply s2 will point to existing String "Adnan" now
both s1 and s2 will be pointing to same string (Memory saved)

2)new Keyword String s2 = new String("Wasi");
whenever we are creating a string using new keyword a string will be created inside young generation of
Heap memory not directly in SCP. if this string has been created for the first time then this string
value will be stored in SCP without any reference.
If we are again creating same string using new keyword new memory in Heap will be allocated for this
new keyword everytime allots a new memory. then SCP will be checked as it already exist t will not
be created again in SCP.

 */
