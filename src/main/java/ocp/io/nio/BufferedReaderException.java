package ocp.io.nio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by dia on 20.9.2017 г..
 */
public class BufferedReaderException {

    public static void main(String[] args) {
        Path myfile = Paths.get("test.txt");
        try (BufferedReader bfr = Files.newBufferedReader(myfile, Charset.forName("US-ASCII"))) {
            String line = null;
            while ((line = bfr.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println(e);//java.nio.file.NoSuchFileException: test.txt
            /*Note that java.io.FileNotFoundException may be thrown by FileInputStream, FileOutputStream,
            and RandomAccessFile constructors if the file by the given name does not exist.*/
        }
    }}

