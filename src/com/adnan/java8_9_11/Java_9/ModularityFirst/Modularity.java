package com.adnan.java8_9_11.Java_9.ModularityFirst;

public class Modularity {
    public static void main(String[] args) {

    }
}
/*
From java 9 java has became modular till java 8 there was a concept of rt.jar where all
our classes were present and during initialization whole rt.jar was loaded it had thousands
of classes.
From java 9 java became modular all those classes were divided into multiple modules
where each module has related classes with each other and the base module is java.base
during project creation java.base will come implicitly and all other non required classes
 were not included.

Due to this our program start time got improved as we are not loading thousands of non required
classes so we are saving our memory.
->If we want any other modules like for Database connection we need java.sql module
then in root folder(src) we have to create module-info.java package inside which
if we want other modules then we have to use  "requires module-name"
if we want to export any module we have to do it package wise we cannot export whole module at once
using "exports package-name" if we want to export our package to only specific outside modules/projects
then we can use "exports package-name to otherModuleName".

//From java 9 defination of pub;ic keyword got changed earlier if we declare a variable/method
using public keyword then it can be accessible from one project to another
but from java 9 if anything is public it can be only accessible in that particular
module/project.

 */
