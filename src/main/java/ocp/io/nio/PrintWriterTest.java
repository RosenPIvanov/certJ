package ocp.io.nio;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
    public void outputText(PrintWriter pw, String text) {
        try {
            pw.write(text);
            if (pw.checkError()) System.out.println("exception in writing");
        } catch (/*IOException never thrown => compile error*/ RuntimeException e) {
            System.out.println("exception in writing");
        }
    }
}
