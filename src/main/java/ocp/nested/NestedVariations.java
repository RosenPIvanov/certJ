package ocp.nested;

public class NestedVariations {
    public void useClasses() {
        //1
        new NestedVariations().new A();
        new NestedVariations.B();
        new A();
        new NestedVariations.A();
        this.new A();
    }

    public static class B {
    }

    public class A {
    }
}

