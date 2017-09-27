package ocp.files;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;


public class TestCopy {
    void move(Path src, Path dest) throws Exception { //insert code here }
        Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
        Files.deleteIfExists(src);
        //Files.isRegularFile()
    }
}
