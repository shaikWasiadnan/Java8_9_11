package com.adnan.java8_9_11.Java_9.jshell1;

public class JShell {
}

/*
Jshell is a REPL tool (Read,Evaluate,Perform,loop)
It is a developer friendly interface where in cmd prompt we can execute our core java
logic without class and main method
->All the valid statements are called as Snippets in Jshell
like:
int i=10;
System.out.println(10+2);
public void add(){
return x+y;
}
Above all lines are called as valid snippets and jshell automatically assigns a
valid id for all of them.
There are three types of statements in Jshell
1)Scratch statements 2)Implicit statements 3)Explicit statements
->Scratch and implicit statements are same that is we we dont create a variable for any expression
Jshell automatically creates variable starting with $anyNumber .
->Explicit statements are which we declare explicitly like int a = 10;

->To get all the Snippets which ever we wrote from starting of Jshell session we can get
by writing /list -all
If we want only curentlly active snippets we can get by doing :  /list

->We can remove Snippets by  /drop idNumber or  /drop snippetVariableName
->To get all variable names we can do /vars to get all method names we can do /methods

->We can get edit mode using /edit

->IN Jshell some required packages will be already imported so we dont have to import them and they
will be counted as valid snippets, we cannot write package statements in jshell

To get out of Jshell /exit
 */