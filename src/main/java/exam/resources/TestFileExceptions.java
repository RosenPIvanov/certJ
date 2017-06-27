package exam.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileExceptions {
    public static void main(String args[]) {
        try (FileInputStream file1 = new FileInputStream(new File("abc.txt"));
             FileInputStream file2 = new FileInputStream(new File("abc.txt"));) {
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }

    //mot Autoclosable
    /*
    void some() {
        try (File file1 = new File("abc.txt"); File file2 = new File("abc.txt");) {
        } catch (
            FileNotFoundException e
            ) {
        } catch (IOException e) {

        }
    }*/
}
