package ocp.io.nio;

import java.io.*;

/**
 * Created by dia on 10.9.2017 г..
 */
public class InputStreamWrapper {
    public static void main(String[] args) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream("zoo.txt"));
        InputStream wrapper = new BufferedInputStream(is);
        wrapper = new ObjectInputStream(is);
        /*  A. BufferedInputStream
            B. FileInputStream
            C. BufferedWriter
            D. ObjectInputStream
            E. ObjectOutputStream
            F. BufferedReader
        */
    }
}
