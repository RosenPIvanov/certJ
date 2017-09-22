package ocp.inheritance;

import ocp.inheritance.p1.A;

public class ProtectedMember extends A {
    public static void main(String[] args) {
        A a = new ProtectedMember();
        ProtectedMember b = new ProtectedMember();
        b.process(a);
        System.out.println(a.getI());
    }

    public void process(A a) {
       //cannot refer through reference of A a.i = a.i * 2;
       // Had the process() method been defined as process(B b); b.i would have been accessible as B is involved in the implementation of B.
    }
}
