package ocp.inheritance;


public interface AInterface {
    default void m1(){
        System.out.println("mi");
    }
}
