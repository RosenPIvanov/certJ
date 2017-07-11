package ocp.inheritance;

public class StaticAndNotStatic {

    static class A {
        static int age() {
            return 10;
        }
    }

    interface B {
        int age();
    }
    //static class C extends A implements B {
    //INSERT CODE HERE
    //class can’t define
    //methods that only differ in their nonaccess modifiers (static and nonstatic)
    //   }
}
