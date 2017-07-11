package ocp.resources;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by dia on 25.6.2017 г..
 */
public class TestRes {
    public static void main(String[] args) {
        try (MyResource1 r1 = new MyResource1();
             MyResource2 r2 = new MyResource2();) {
            System.out.print("T ");
        } catch (IOException ioe) {
            System.out.print("IOE ");
        } finally {
            System.out.print("F ");
        }
    }
}

class MyResource1 implements AutoCloseable {
    public void close() throws IOException {
        System.out.print("1 ");
    }
}
class MyResource2 implements Closeable {
    public void close() throws IOException {
        throw new IOException();
    }
}
