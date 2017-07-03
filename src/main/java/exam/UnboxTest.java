package exam;

/**
 * Created by dia on 2.7.2017 г..
 */
public class UnboxTest {
    public static void main(String args[]) {
        //System.out.println((new Integer(10) + new Short((short) 100)).getClass());
        Integer i = new Integer(10) + new Integer(10);
        System.out.println(i + (new Integer(10) + new Short((short) 100)));
    }
}
