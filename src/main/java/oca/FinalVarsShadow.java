package oca;

class A {
    final int fi = 10;
    static final int sfi = 10;
    final static void cannotShadow() {}
    static void canShadow() {}
}

public class FinalVarsShadow extends A {
    int fi = 15;
    static int sfi = 15;
    //static void cannotShadow() {}
    static void canShadow() {}

    public final static void main(String[] args) {
        FinalVarsShadow b = new FinalVarsShadow();
        b.fi = 20;
        System.out.println(b.fi);
        System.out.println(((A) b).fi);

        System.out.println(b.sfi);
        System.out.println(((A) b).sfi);
    }

}
