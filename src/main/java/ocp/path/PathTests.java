package ocp.path;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

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
        testRelativeFiles();
        testAbsolute();
        testMixed();
        testJoinAbsoluteAndRelative();
        testNormalize();
        test8();
        testSubPath();
        testResolveException();
        testNormalize2();
        testNormalize2();
    }

    static void testNormalize2(){

        final Path path = Paths.get(".").normalize(); // //""
        int count = 0;
        for(int i=0; i<path.getNameCount(); ++i) {
            count++;
            System.out.println(path.getName(i));//""
        }
        System.out.println(count);

    }
    static void testSubPath() {
        System.out.println("testSubPath");
        Path path = Paths.get("/zoo/animals/bear/koala/food.txt");
        System.out.println(path.subpath(1, 3));
        System.out.println(path.subpath(1, 3).getName(1));//returns Path
        System.out.println(path.subpath(1, 3).getName(1).toAbsolutePath());
    }

    static void test1() {
        System.out.println("new test");
        Path path1 = Paths.get("C:/OCP/8-1.txt");
        Path path2 = Paths.get("C:", "OCP", "mock", "8-1.txt");
        Path path21 = path2.relativize(path1);
        System.out.println(path21);
        Path path3 = path1.resolve(path21);
        System.out.println(path3);
    }

    static void testRelativeFiles() {
        System.out.println("RelativeFiles test");
        Path path1 = Paths.get("fish.txt");
        Path path2 = Paths.get("birds.txt");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));
    }

    static void testAbsolute() {
        System.out.println("Absolute test");
        Path path1 = Paths.get("/fish.txt");
        Path path2 = Paths.get("/someDir/birds.txt");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));
    }

    static void testMixed() {
        System.out.println("Mixed test");
        //the same drive letter is required for widows
        try {
            Path path1 = Paths.get("fish.txt");
            Path path2 = Paths.get("/someDir/birds.txt");
            System.out.println(path1.relativize(path2));
            System.out.println(path2.relativize(path1));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    static void testJoinAbsoluteAndRelative() {
        System.out.println("testJoinAbsoluteAndRelative");
        Path path1 = Paths.get("/cats/../panter");
        Path path2 = Paths.get("food");
        System.out.println(path1.resolve(path2));
        System.out.println(path2.resolve(path1));//path2 is ignored
    }

    static void testNormalize() {
        System.out.println("testNormalize");
        Path path1 = Paths.get("/data");
        Path path2 = Paths.get("/user/home");
        System.out.println(path1.resolve(path2));
        System.out.println(path2.resolve(path1));//path2 is ignored
    }

    static void test8() {
        Path path = Paths.get("/user/.././root", "../kodiacbear.txt");
        path.normalize().relativize(Paths.get("/lion"));
        System.out.println(path);
        System.out.println(path.normalize());
        Path path2 = path.normalize().relativize(Paths.get("/lion"));
        System.out.println(path2);
    }

    static void testResolveException() {
        Path path = Paths.get("turkey");
        try {
            if (Files.isSameFile(path, Paths.get("/zoo/turkey"))) // x1
                System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
