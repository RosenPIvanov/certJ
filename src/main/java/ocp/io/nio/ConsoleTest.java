package ocp.io.nio;

import java.io.Console;
import java.io.IOException;

/**
 * Created by dia on 10.9.2017 г..
 */
public class ConsoleTest {
    public static void main(String[] args) {
        Console c = System.console();
        c.reader();//not c.read()
        String s = c.readLine();
        char[] chars = c.readPassword();
        //no c.input
        //no c.readString()
    }
    }
