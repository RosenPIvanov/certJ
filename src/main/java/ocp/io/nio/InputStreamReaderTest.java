package ocp.io.nio;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    void read() throws Exception {
        try (FileInputStream fis = new FileInputStream("c:\\temp\\test.txt");
             InputStreamReader isr = new InputStreamReader(fis)) {
            while (isr.ready()) {
                isr.skip(1);
                int i = isr.read();
                char c = (char) i;
                System.out.print(c);
            }
        }
    }
}
