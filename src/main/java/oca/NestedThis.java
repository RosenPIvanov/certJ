package oca;

public class NestedThis {

    String a = "x";
    static char b = 'x';
    String c = "x";

    class Inner {
        String a = "y";

        String get() {
            String c = "temp";
            // Line 1
            c = NestedThis.this.a;
            //
            return c;
        }
    }

    NestedThis() {
        System.out.println(new Inner().get());
    }

    public static void main(String args[]) {
        new NestedThis();
    }

}
