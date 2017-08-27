package ocp.path;

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
        testRelativeFiles();
        testAbsolute();
        testMixed();
        testJoinAbsoluteAndRelative();
        testNormalize();
    }

    static void test1(){
        System.out.println("new test");
        Path path1 = Paths.get("C:/OCP/8-1.txt");
        Path path2 = Paths.get("C:", "OCP", "mock", "8-1.txt");
        Path path3 = path1.resolve(path2.relativize(path1));
        System.out.println(path3);
    }

    static void testRelativeFiles(){
        System.out.println("RelativeFiles test");
        Path path1 = Paths.get("fish.txt");
        Path path2 = Paths.get("birds.txt");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));
    }

    static void testAbsolute(){
        System.out.println("Absolute test");
        Path path1 = Paths.get("/fish.txt");
        Path path2 = Paths.get("/someDir/birds.txt");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));
    }

    static void testMixed(){
        System.out.println("Mixed test");
        //the same drive letter is required for widows
        try{
        Path path1 = Paths.get("fish.txt");
        Path path2 = Paths.get("/someDir/birds.txt");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));}
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    static void testJoinAbsoluteAndRelative(){
        System.out.println("testJoinAbsoluteAndRelative");
        Path path1 = Paths.get("/cats/../panter");
        Path path2 = Paths.get("food");
        System.out.println(path1.resolve(path2));
        System.out.println(path2.resolve(path1));//path2 is ignored
    }

    static void testNormalize(){
        System.out.println("testNormalize");
        Path path1 = Paths.get("/data");
        Path path2 = Paths.get("/user/home");
        System.out.println(path1.resolve(path2));
        System.out.println(path2.resolve(path1));//path2 is ignored
    }

}
