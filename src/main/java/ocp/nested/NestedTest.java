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
    public class Outer {
        //Inner classes are not allowed to contain static methods
        //or static variables. Only nested static classes are permitted to contain statics
        //static int x=0; compilation error

    }
}