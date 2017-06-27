package exam.path;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * Created by xworks.admin on 27/06/2017.
 */
public class PathTests {
    public static void main(String args[]) {
        Path path1 = new File("/home/oracle").toPath();
        Path path2 = FileSystems.getDefault().getPath("/home/java/../hello.txt");
        Path path3 =  path2.normalize();
        System.out.println(path3);
        System.out.println(path1.resolve(path2));//path2 is absolute
        System.out.println(path1.relativize(path2));//
        System.out.println(path2.relativize(path1));//
    }
}
