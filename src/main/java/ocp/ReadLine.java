package ocp;

import java.io.Console;

public class ReadLine {
    public static void main(String args[]) {
        Console console = System.console();               //line1
        String name = console.readLine("Enter name:");    //line2
        String in = console.readLine();                   //line3
        System.out.println(in.length());
    }
}
