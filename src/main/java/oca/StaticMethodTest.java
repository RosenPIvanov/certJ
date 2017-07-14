package oca;

interface Pow {
    String CONST = "A";

    static void wow() {
        System.out.println("In Pow.wow");
    }

    default void wow2() {
        System.out.println("In default Pow.wow2");
    }
}

abstract class Wow {
    static void wow() {
        System.out.println("In Wow.wow");
    }
    public void wow2() {
        System.out.println("In abstract wow2");
    }
}

public class StaticMethodTest extends Wow implements Pow {
    public static void main(String[] args) {
        StaticMethodTest f = new StaticMethodTest();
        f.wow();
        System.out.println(((Pow) f).CONST); // do not work for static methods
        wow();


        /*always current class*/
        f.wow2();
        ((Wow)f).wow2();
        ((Pow)f).wow2();//not possible for static methods: ((Pow)f).wow()
    }

    public void wow2() {
        System.out.println("In StaticMethodTest wow2");
    }

}
