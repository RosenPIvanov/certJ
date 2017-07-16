package oca;

/**
 * Created by disen on 16.07.17.
 */
public class VarArgsTest {
    static void m1(String [] args){
        System.out.println("m1");
    }

    static void m2(String ... args){
        System.out.println("m2");
    }
    public static void main(String args[]){
        m1(new String[]{""});
        m2("");

    }
}
