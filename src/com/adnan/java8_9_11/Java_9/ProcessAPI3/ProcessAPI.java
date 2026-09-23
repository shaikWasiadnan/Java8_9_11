package com.adnan.java8_9_11.Java_9.ProcessAPI3;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

public class ProcessAPI {
    public static void main(String[] args) throws IOException {
//          ProcessHandle.allProcesses()
//                .forEach(p-> System.out.println(p.pid()));
        //To destroy a process.
        Optional<ProcessHandle> p1 = ProcessHandle.of(4568);
        if(p1.isPresent()){
            ProcessHandle p2 = p1.get();
            p2.destroy();
        }
        //To start a process
       // Process p = new ProcessBuilder("path of process").start();
    }
}
/*
ProcessAPI
This got introduced in java 9 to directly work with Operating System of our current system.
We can get the all process which are running .instead of going to task manager and checking the processes
we can do it using ProcessHandle interface we can stop any process by calling .destroy() method.

Usecase:
When working with Spring Batch where we have to process millions of records at same time
if our sytem's another application/process is consuming lot of memory/Cpu then before starting
Batch operation we can kill those processes.and start our batch operation to be performed smoothly.

//To start a process there is a class called as ProcessBuilder which takes process path in its
constructor then on object of ProcessBuilder if we call start() method we will be starting a process.

//To destroy a process first we have to get the process we get get it using ProcessHandle Interface
which has static method of() which takes process id. which will return an Optional object
then if present we can call destroy() method on ProcessHandle reference.
 */