package ocp.inheritance;

/**
 * Created by xworks.admin on 14/07/2017.
 */
public interface BInterface extends AInterface {
    default void m1(){
        //no way super.m1();
        System.out.println("mi");
    }
}
