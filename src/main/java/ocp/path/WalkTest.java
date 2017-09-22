package ocp.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WalkTest {
    public static void main(String args[]) throws IOException {
        Path path = Paths.get("/animals");
        boolean myBoolean = Files.walk(path)
                .filter((p) -> /*p.isDirectory() &&*/ !path.equals(p)) // w1
                .findFirst().isPresent(); // w2
        System.out.println(myBoolean ? "No Sub-directory" : "Has Sub-directory");

        Files.find(path, 0,
                (p, a) -> a.isDirectory() && !path.equals(p)) // w1 bipredicate
                .findFirst().isPresent(); // w2
        System.out.println(myBoolean ? "No Sub-directory" : "Has Sub-directory");
        Files.list(path);
    }
}
