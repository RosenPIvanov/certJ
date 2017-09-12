package ocp.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

public class FileAttributesTest {
    public static void main(String args[]) throws IOException {
        Path path = Paths.get("sloth.schedule");
        BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
        if (attributes.size() > 0 && attributes.creationTime().toMillis() > 0) {
            // no modification methods attributes.setTimes(null,null,null);
        }
        BasicFileAttributeView attributesView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        //if(attributesView.size()>0 && attributesView.creationTime().toMillis()>0) {
        attributesView.setTimes(null, null, null);
        //}
        BasicFileAttributes attributes2 = attributesView.readAttributes();
    }
}
