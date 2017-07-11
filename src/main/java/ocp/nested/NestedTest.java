package ocp.nested;

/**
 * Created by xworks.admin on 03/07/2017.
 */
public class NestedTest {
    public static void main(String[] args) {
        new Inner().new Outer();
    }
}


 class Inner {
    public class Outer {}
}