package com.adnan.java8_9_11.Java_11.FileAccess3;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class File {
    public static void main(String[] args) throws IOException {
        //old method to access any file
        FileReader fileReader = new FileReader("C:\\Users\\SHAIK IDREES\\OneDrive\\Documents\\Test.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        while((line=br.readLine()) != null){
            System.out.println(line);
        }
        br.close();

        //New Method

        Path p = Path.of("C:\\Users\\SHAIK IDREES\\OneDrive\\Documents\\Test.txt");
        List<String> content = Files.readAllLines(p);
        System.out.println(content);
        Files.writeString(p,"Iam good how are you", StandardOpenOption.APPEND);
        System.out.println(Files.readString(p));
    }
}
/*
Previously to read a txt document we have to create a FileReader then pass it to BufferedReader
then get all lines of doc then without fail close the document as BufferedReader is indirectly
implementing AutoClosable Interface

New Method to access files have been Simplified using Path interface which have of() static method
which accepts the URI then use Files class to readAllLines() method or readString() method to read the content
to write anything to the existing file we can use writeString() method present in Files class
we can append to existing file or truncate existing then add new string etc...
writeString takes Path,string which we want to add,Operation which we want to so on file by using
StandardOpenOption enum.

 */
