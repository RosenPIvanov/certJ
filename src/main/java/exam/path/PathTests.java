package exam.path;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by xworks.admin on 27/06/2017.
 */
public class PathTests {
    public static void main(String args[]) {
        Path path1 = new File("/home/oracle").toPath();
        Path path2 = FileSystems.getDefault().getPath("/home/java/../hello.txt");
        Path path3 = path2.normalize();
        System.out.println(path3);
        System.out.println(path1.resolve(path2));//path2 is absolute
        System.out.println(path1.relativize(path2));//
        System.out.println(path2.relativize(path1));//
        test1();
    }
    static void test1(){
        System.out.println("new test");
        Path path1 = Paths.get("C:/OCP/8-1.txt");
        Path path2 = Paths.get("C:", "OCP", "mock", "8-1.txt");
        Path path3 = path1.resolve(path2.relativize(path1));
        System.out.println(path3);
    }
}
